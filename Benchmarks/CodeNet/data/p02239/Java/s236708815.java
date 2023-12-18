import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static int[] D=new int[101];
	static int n;
    static int[][] v=new int [101][101];
	static void bfs(int src) {
    	Queue<Integer>	Q=new ArrayDeque<Integer>();
    	Q.add(src);
    	D[src]=0;
    	while(! Q.isEmpty()) {
    		int cur = Q.remove();//先頭要素を取り出す
    		for(int i=2; i<=n;i++) {//各行先に対して
    			if(D[i]==0 && v[cur][i]>0) {//未訪問で、curから辺があるなら
    				D[i] = D[cur]+1;
    				Q.add(i);//行き先を訪問先に加える
    			}
    		}
    	}
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        v=new int [101][101];
        for(int i=1; i<=n; i++) {
        	int u=sc.nextInt();
        	int k=sc.nextInt();
        	for(int j=1; j<=k; j++) {
        		int a=sc.nextInt();
        		v[u][a]++;
        	}
        }
        bfs(1);
        for(int i= 1; i<=n; i++) {
        	if(i != 1 && D[i]==0)	System.out.println(i + " "+-1);
        	else	System.out.println(i + " " + D[i]);
        }
        
        
        
        
	}
}
