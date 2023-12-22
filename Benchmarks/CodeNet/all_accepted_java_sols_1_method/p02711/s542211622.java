import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int digit = 0;
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    boolean no = true;
	    while(n != 0){
	        digit = n % 10;
	        if(digit == 7){
	            System.out.println("Yes");
	            no = false;
	            break;
	        }
	        n= Math.floorDiv(n, 10);
	        
	    }
	    if(no == true)
	    System.out.println("No");
	}
}
