import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int d= sc.nextInt();
		System.out.println(n%(2*d+1)==0?(n/(2*d+1)):(n/(2*d+1)+1));
	}
}
