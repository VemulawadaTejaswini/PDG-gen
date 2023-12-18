import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x-y<0) System.out.println("a < b");
		else if(x-y>0) System.out.println("a > b");
		else System.out.println("a == b");
	}
}