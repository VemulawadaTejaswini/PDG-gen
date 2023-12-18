import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int leg = sc.nextInt();
        if(leg % 2 == 1){
        	System.out.println("No");
        }else if(leg < 2 * n){
        	System.out.println("No");
        }else if(leg > 4 * n){
        	System.out.println("No");
        }else{
        	System.out.println("Yes");
        }
	}
}