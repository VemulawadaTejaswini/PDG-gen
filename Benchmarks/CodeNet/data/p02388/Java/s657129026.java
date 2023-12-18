import java.util.Scanner;

public class Cubed{
    public static void main(String[]args){
	Scanner stdin = new Scanner(System.in);
	//int x = Integer.parseInt(args[0]);
	int x = stdin.nextInt();
	System.out.println(x*x*x);
    }
}