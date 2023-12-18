import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		sc.close();
		int[] r = new int[10];//1,4,7,9
		r[n1]++;
		r[n2]++;
		r[n3]++;
		r[n4]++;
		System.out.println(r[1]==1&&r[4]==1&&r[7]==1&&r[9]==1?"YES":"NO");
	}
}