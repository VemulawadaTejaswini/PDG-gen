import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String s1 = sc.nextLine();
        final String s2 = sc.nextLine();
    	final String s3 = sc.nextLine();
                
        System.out.println(String.valueOf(s1.charAt(0)) + String.valueOf(s2.charAt(1)) + String.valueOf(s3.charAt(2)));
    }
    
}