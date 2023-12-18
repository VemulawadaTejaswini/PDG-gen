import java.util.*;

public class Main{

    int n,k;
    String[] string;
    ArrayList<Character> appear;
    ArrayList<Character> head;
    int[] headIndex, appearIndex;
    int cnt;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    n = sc.nextInt();
	    if(n==0) break;
	    string = new String[n];
	    for(int i=0; i<n; i++) string[i] = sc.next();
	    appear = new ArrayList<Character>();
	    head = new ArrayList<Character>();
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

	    for(int i=0; i<head.size(); i++){
		headIndex[appear.indexOf(head.get(i))] = 1;
	    }
	    for(int i=0; i<appear.size(); i++){
		appearIndex[appear.get(i)-'A'] = i;
	    }

	    k = appear.size();
	    cnt = 0;
	    dfs(0,new int[10], new int[k]);

	    System.out.println(cnt);
	}
    }

    void dfs(int pos, int[] used, int[] num){
	if(pos==k){
	    if(equal(num)) cnt++;
	    return;
	}

	for(int i=0; i<10; i++){
	    if(used[i]==0){
		if(i==0 && headIndex[pos]==1) continue;
		num[pos] = i;
		used[i] = 1;
		dfs(pos+1,used,num);
		used[i] = 0;
	    }
	}
    }

    boolean equal(int[] num){
	long sum = 0, result = 0;
	String ns = "";

	int len = string[n-1].length();
	if(len!=1 && num[getIndex(n-1,0)]==0) return false;
	for(int i=0; i<len; i++) ns += num[getIndex(n-1,i)];
	result = Long.parseLong(ns);

	for(int i=0; i<n-1; i++){
	    ns = "";
	    len = string[i].length();
	    if(len!=1 && num[getIndex(i,0)]==0) return false;
	    for(int j=0; j<len; j++) ns += num[getIndex(i,j)];
	    sum += Long.parseLong(ns);
	}

	if(sum==result) return true;
	return false;
    }

    int getIndex(int s, int idx){
	return appearIndex[string[s].charAt(idx)-'A'];
    }

    public static void main(String[] args){
	new Main().solve();
    }
}