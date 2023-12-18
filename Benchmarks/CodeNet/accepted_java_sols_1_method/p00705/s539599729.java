
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()) {
                int n = sc.nextInt();
                int q = sc.nextInt();
                if(n+q == 0)break;
                
                int[][] date = new int[n+1][101];
                int[] quo = new int[101];
                for(int i=0;i<=100;i++) {
                	quo[i] = 0;
                }
                
                int limit = 0;
                for(int i=1;i<=n;i++) {
                	 int m = sc.nextInt();
                	 if(m==0)continue;
                	 for(int j=1;j<=m;j++) {
                		 int in = sc.nextInt();
                		 if(limit<in)
                			 limit = in;
                		 date[i][j] = in;
                		 quo[in]++;
                	 }
                }
                
                int max = 0;
                int near = 0;
                for(int i=1;i<=limit;i++) {
                	if(quo[i]==n) {
                		near = i;
                		break;
                	}
                	if(quo[i]>max) {
                			 max = quo[i];
                			 near = i;
                	}
                }
                if(quo[near] < q)
                	System.out.println(0);
                else
                	System.out.println(near);
            }
        }
    }
}
