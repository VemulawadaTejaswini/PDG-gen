import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	            while(true) {
	            int  H = sc.nextInt();
	            int W=sc.nextInt();	
	            if(W==0 && H==0)
	            		break;
	            	for(int i=0;i<H;i++)
	            		System.out.print("#");
	            	System.out.println();
	            	for(int i=2;i<W;i++) {
	            		System.out.print("#");
	            		for(int j=2;j<H;j++) {
	            			System.out.print(".");
	            	}
	            	System.out.println("#");
	            }
	            	for(int i=0;i<H;i++)
	            	System.out.print("#");
	            }
	            sc.close();
	    }
	}
