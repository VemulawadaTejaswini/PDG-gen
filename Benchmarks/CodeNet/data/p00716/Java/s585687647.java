import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            while(m-- != 0) {
            	int a = sc.nextInt();
            	int t = sc.nextInt();
            	int n = sc.nextInt();
            	int max = a;
            	while(n-- != 0) {
            		int k = sc.nextInt();
            		double r = sc.nextDouble();
            		int b = sc.nextInt();
            		if(k == 0) {
            			int x = a;
            			int ris = 0;
            			for(int i=0; i<t; i++) {
            				ris += x*r;
            				x -= b;
            			}
            			max = Math.max(max, x+ris);
            		}
            		else {
            			int x = a;
            			for(int i=0; i<t; i++) {
            				x = (int)(x + x*r - b);
            			}
            			max = Math.max(max, x);
            		}
            	}
            	System.out.println(max);
            }
        }
    }
}

