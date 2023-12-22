import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        String in=s.next();
        
        if(in.charAt(0)<92) {
        	System.out.println("A");
        }else {
        	System.out.println("a");
        }
       
    }
}