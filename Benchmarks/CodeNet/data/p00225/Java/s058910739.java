import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int[] alpha;
    boolean[][] shiritori;
    boolean[] use;
    boolean ans;

    void run(){
	while(true){
	    n = sc.nextInt();
	    if(n==0) break;
	    input();
	    solve();
	    System.out.println(ans ? "OK" : "NG");
	}
    }

    void input(){
	ans = true;
	alpha = new int[26];
	use = new boolean[26];
	shiritori = new boolean[26][26];
	for(int i=0; i<n; i++){
	    char[] c = sc.next().toCharArray();
	    int start = c[0]-97;
	    int end = c[c.length-1]-97;
	    alpha[start]++;
	    alpha[end]--;
	    shiritori[start][end] = true;
	    use[start] = use[end] = true;
	}
    }
    
    
    void solve(){
	for(int i=0; i<alpha.length; i++)
	    if(alpha[i]!=0){ ans=false; return; }

	for(int i=0; i<26; i++)
	    for(int k=0; k<26; k++)
		for(int r=0; r<26; r++){
		    shiritori[k][r] = 
			(shiritori[k][r] || (shiritori[k][i]&&shiritori[i][r]));
		}
	for(int i=0; i<26; i++){
	    if(use[i] && !shiritori[i][i]){ ans=false; return; }
	    int count = 0;
	    for(int k=0; k<26; k++)
		if(i!=k && shiritori[i][k]) count++;
	    if(count==0){ ans=false; return; }
	}

	//show();
       
    }

    void show(){
	for(int i=0; i<26; i++){
	    for(int k=0; k<26; k++)
		System.out.print(shiritori[i][k] ? "o " : "x ");
	    System.out.println();
	}
    }
}