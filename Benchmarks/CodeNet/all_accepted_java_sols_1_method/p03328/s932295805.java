import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int[] t = new int[999];
		int sum=0;
		for(int i=1; i<999;i++) {
			sum+=i;
			t[i]=sum;
		}
		System.out.println(t[b-a-1]-a);
	}
}
