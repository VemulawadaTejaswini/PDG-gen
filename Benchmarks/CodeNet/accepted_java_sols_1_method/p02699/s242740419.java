import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
int S,W;

	     Scanner sc = new Scanner(System.in);
	     S = sc.nextInt();
	     W=sc.nextInt();
	     if(S<=W) {
	    	 System.out.println("unsafe");	
	     }else {
	    	 System.out.println("safe");	}
	     sc.close();
	}

}
