import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        if(n <= 1199){
        	System.out.println("ABC");
        }else if(n <= 2799){
        	System.out.println("ARC");
        }else{
        	System.out.println("AGC");
        }
	}
}