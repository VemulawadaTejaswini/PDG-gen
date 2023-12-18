import java.util.Scanner;
        
        public class Main {
        	public static void main(String[] args) {
        		Scanner in = new Scanner(System.in);
        		int a = in.nextInt();
        		int v = in.nextInt();
        		int b = in.nextInt();
        		int w = in.nextInt();
        		int t = in.nextInt();
        		
        		if(a<b) {
        			for(int i=0;i<t;i++ ) {
            			a=a+v;
            			b=b+w;
            			
            			if(a==b || a>b) {
            				System.out.println("YES");
            				break;
            			}
            			if(i==t-1) {
            				System.out.println("NO");
            				break;
            			}
        			}
        		}else{
            		for(int i=0;i<t;i++ ) {
                		a=a+v;
                		b=b+w;
                		
                		if(a==b || a<b) {
                			System.out.println("YES");
                			break;
                			}
                			if(i==t-1) {
                				System.out.println("NO");
                				break;
                			}
            		}
        		}
        	}
        }