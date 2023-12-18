import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int i = 0;
		while( a != 0){
			a = sc.nextInt();
			System.out.printf("Case %d:%d\n", i,a);
			i++;

		}
	}
}