import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();

	int p = a+b;
	int m = a-b;
	int t = a*b;

	System.out.println(Math.max(Math.max(p,m),t));
    }
}
