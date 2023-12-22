
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()) {
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int x = sc.nextInt();
                if(b+a+b+c+x == 0)break;
                int cnt = 0;
                int[] y = new int[n+1];
                for(int i=1;i<=n;i++) {
                	y[i] = sc.nextInt();
                }
                
                int X = x;
                boolean can = true;
                for(int i=1;i<=n;i++) {
	                while(true) {
	                	boolean fin = false;
	                	if(X==y[i]) {
	                		if(i != n)
	                			cnt++;
	                		X = (a*X + b) % c;
	                		fin = true;
	                		break;
	                	}
	                	if(cnt == 10000) {
	                		can = false;
	                		break;
	                	}
	                	X = (a*X + b) % c;
	                	if(!fin)cnt++;
	                }
	                if(!can)break;
                }
                if(!can || cnt > 10000)
                	System.out.println(-1);
                else
                	System.out.println(cnt);
            }
        }
    }
}
