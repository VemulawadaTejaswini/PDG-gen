
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
	String s;

	if (a < b && b < c)
		s = "Yes";
	else
		s = "No";
        System.out.printf("%s%n", s);
    }   
}