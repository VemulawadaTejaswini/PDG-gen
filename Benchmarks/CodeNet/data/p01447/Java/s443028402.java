import java.util.Scanner;
 
 
public class Main{
     
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	final int n = sc.nextInt();
    	
    	int num = (int) (Math.ceil(Math.log10(n) / Math.log10(3)));
    	
    	System.out.println(num);
    }
     
}