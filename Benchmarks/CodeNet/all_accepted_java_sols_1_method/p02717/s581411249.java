import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String Y = sc.next();
        String Z = sc.next();
        
        String temp = X;
      	X = Y;
      	Y = temp;
      
      	temp = X;
      	X = Z;
      	Z = temp;
      
      	System.out.println(X + " " + Y + " " + Z);
    }
}