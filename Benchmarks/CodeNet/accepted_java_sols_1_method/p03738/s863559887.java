import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        if(n1 > n2){
        	System.out.println("GREATER");
        }else if(n1 < n2){
        	System.out.println("LESS");
        }else{
        	System.out.println("EQUAL");
        }
    }
}