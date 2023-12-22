import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int k = a + b;
        if(k%2==0)
            System.out.println(k/2);
        else
            System.out.println("IMPOSSIBLE");
    }
}