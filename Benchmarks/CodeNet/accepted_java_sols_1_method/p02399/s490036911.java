import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		System.out.printf("%d %d %f\n",x/a,x%a,(double)x/a);
		sc.close();
	}
}
