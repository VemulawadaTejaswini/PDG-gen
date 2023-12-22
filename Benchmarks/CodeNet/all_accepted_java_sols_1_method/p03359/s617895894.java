import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
        int d = sc.nextInt();
        if(m <= d){
        	System.out.println(m);
        }else{
        	System.out.println(m - 1);
        }
    }
}