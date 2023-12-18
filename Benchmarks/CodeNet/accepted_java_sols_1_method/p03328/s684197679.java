import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int dif=b-a;

		int towerA=dif*(dif-1)/2;
		System.out.println(towerA-a);
	}
}