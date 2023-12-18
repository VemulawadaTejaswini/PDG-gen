import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new B().doIt();
    }
    class B{
    	int DP(int map[][],int n,int m,int C[],int D[]){
    		int length = m - n + 1;
    		for(int i = 0;i < length;i++)map[0][i] = C[i] * D[0];
    		for(int i = 1;i < n;i++){
    			for(int j = i;j < i + length;j++){
    				for(int k = j;k < i + length;k++){
    					map[i][k] = Math.min(map[i][k],D[i] * C[k] + map[i-1][j-1]);
    				}
    			}
    		}
    		int result = Integer.MAX_VALUE;
    		for(int i = 0;i < m;i++)result = Math.min(map[n-1][i], result);
    		return result;
    	}
        void doIt(){
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	int D[] = new int[n];
        	int C[] = new int[m];
        	int map[][] = new int [n][m];
        	for(int i = 0;i < n;i++)Arrays.fill(map[i], Integer.MAX_VALUE);
        	for(int i = 0;i < n;i++)D[i] = Integer.parseInt(sc.next());
        	for(int i = 0;i < m;i++)C[i] = Integer.parseInt(sc.next());
        	System.out.println(DP(map,n,m,C,D));
//        	for(int i = 0;i < n;i++){
//        		for(int j = 0;j < m;j++){
//        			System.out.print(map[i][j]+" ");
//        		}
//        		System.out.println();
//        	}
        }
    }
}