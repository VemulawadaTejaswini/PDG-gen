import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int sum = a+b;
		int mul = a-b;
		int kake = a*b;
		int[] array = {sum,mul,kake};
		int max = Integer.MIN_VALUE;
		for(int i:array) {
			if(max<i) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
