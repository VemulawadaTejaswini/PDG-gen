
import java.util.Scanner;

public class Main {

    public static int queryCount=0;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(x-a-(x-a)/b*b);
    }
}
