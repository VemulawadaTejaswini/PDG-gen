import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int m = sc.nextInt();
        	int nmin = sc.nextInt();
        	int nmax = sc.nextInt();
        	if(m + nmin + nmax == 0) break;
        	int[] p = new int[m];
        	for(int i=0;i<m;i++) {
        		p[i] = sc.nextInt();
        	}
        	int pass = 0;
        	int g = 0;
        	for(int i=nmin;i<=nmax;i++) {
        		if(Math.abs(p[i-1] - p[i]) >= g) {
        			g = Math.abs(p[i-1] - p[i]);
        			pass = i;
        		}
        	}
        	System.out.println(pass);
         }
    }
}
