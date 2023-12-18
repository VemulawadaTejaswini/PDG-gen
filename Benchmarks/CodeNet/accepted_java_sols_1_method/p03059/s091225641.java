import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
        int t = scan.nextInt();
 
	double time = t+0.5;
	int x = (int)time/a;
	System.out.println(x*b);
    }
}
