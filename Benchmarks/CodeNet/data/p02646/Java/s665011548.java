import java.util.Scanner;
        
        public class Main {
        	public static void main(String[] args) {
        		Scanner in = new Scanner(System.in);
        		int a = in.nextInt();
        		int v = in.nextInt();
        		int b = in.nextInt();
        		int w = in.nextInt();
        		int t = in.nextInt();
        		
        		for(int i=0;i<t;i++ ) {
        			a=a+v;
        			b=b+w;
        			
        			if(a==b) {
        				System.out.println("Yes");
        				break;
        			}
        			if(i==t-1) {
        				System.out.println("No");
        				break;
        			}
        		}
        		
        	}
        }