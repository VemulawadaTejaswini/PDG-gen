import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int b = 1;
		int i = 0;
		while( b != 0){
			int a = sc.nextInt();
			i++;
			if(a==0){
				break;

			}
			System.out.printf("Case %d: %d\n", i,a);
		}
	}
}