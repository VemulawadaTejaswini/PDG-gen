import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int d,n;
	d = sc.nextInt(); n = sc.nextInt();
	System.out.println((int)Math.pow(100 , d )* (n + (n / 100)));
    }
}
