import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		int a = Integer.parseInt(sc.nextLine());
		while(sc.hasNext()) {
			int i = Integer.parseInt(sc.next());
			max = Math.max(max, i);
			sum += i;
		}
		int sum2 = sum - max;
		if(max < sum2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
