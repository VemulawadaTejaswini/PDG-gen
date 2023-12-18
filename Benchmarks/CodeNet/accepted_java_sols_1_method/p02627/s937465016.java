import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        
       	Scanner sc=new Scanner(System.in);
		char c = sc.next().charAt(0); 
   
		if(Character.isUpperCase(c))
		{
		    System.out.println("A");
		}
		else if(Character.isLowerCase(c))
		{
		    System.out.println("a");
		}
    }
}