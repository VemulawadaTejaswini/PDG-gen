import java.util.*;

public class Main{

    int n, k, cnt;
    String[] string;
    ArrayList<Character> head, appear;
    int[] headIndex, appearIndex, num;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    n = sc.nextInt();
	    if(n==0) break;
	    string = new String[n];
	    for(int i=0; i<n; i++) string[i] = sc.next();
	    head = new ArrayList<Character>();
	    appear = new ArrayList<Character>();
	    headIndex = new int[10];
	    appearIndex = new int[26];
	    for(int i=0; i<n; i++){
		char ch = string[i].charAt(0);
		if(!head.contains(ch) && string[i].length()!=1) head.add(ch);
		for(int j=0; j<string[i].length(); j++){
		    char c = string[i].charAt(j);
		    if(!appear.contains(c)) appear.add(c);
		}
	    }

	    for(int i=0; i<head.size(); i++) headIndex[appear.indexOf(head.get(i))] = 1;
	    for(int i=0; i<appear.size(); i++) appearIndex[appear.get(i)-'A'] = i;

	    k = appear.size();
	    cnt = 0;
	    num = new int[k];
	    dfs(0,new int[10]);

	    System.out.println(cnt);
	}
    }

    void dfs(int pos, int[] used){
	if(pos==k){
	    if(equal()) cnt++;
	    return;
	}

	for(int i=0; i<10; i++){
	    if(used[i]==0){
		if(i==0 && headIndex[pos]==1) continue;
		num[pos] = i;
		used[i] = 1;
		dfs(pos+1,used);
		used[i] = 0;
	    }
	}
    }

    boolean equal(){
	long sum = 0, result = 0;
	String ns = "";

	int len = string[n-1].length();
	if(len!=1 && getNumber(n-1,0)==0) return false;
	for(int i=0; i<len; i++) ns += getNumber(n-1,i);
	result = Long.parseLong(ns);

	for(int i=0; i<n-1; i++){
	    ns = "";
	    len = string[i].length();
	    if(len!=1 && getNumber(i,0)==0) return false;
	    for(int j=0; j<len; j++) ns += getNumber(i,j);
	    sum += Long.parseLong(ns);
	}

	if(sum==result) return true;
	return false;
    }

    int getNumber(int s, int idx){
	return num[appearIndex[string[s].charAt(idx)-'A']];
    }

    public static void main(String[] args){
	new Main().solve();
    }
}