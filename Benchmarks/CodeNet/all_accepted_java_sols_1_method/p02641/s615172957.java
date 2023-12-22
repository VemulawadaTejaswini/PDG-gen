import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int X = sc.nextInt();
    	int N = sc.nextInt();
    	if(N==0) {
    		System.out.println(X);
    	} else {
    		int[] p = new int[102];
    		for(int i=1;i<=N;i++) {
    			int x = sc.nextInt();
    			p[x] = 1;
    		}
    		int d = 10000;
    		int ans = X;
    		for(int j=-1;j<=101;j++) {
    			if(j<=0||j>=101) {
    				int d2 = Math.abs(j-X);
    				if(d2<d) {
    					d = d2;
    					ans = j;
    				}
    			} else {
        			if(p[j]!=1) {
        				int d2 = Math.abs(j-X);
        				if(d2<d) {
        					d = d2;
        					ans = j;
        				}
        			}
    			}
    		}
    		System.out.println(ans);
    	}
    }
}