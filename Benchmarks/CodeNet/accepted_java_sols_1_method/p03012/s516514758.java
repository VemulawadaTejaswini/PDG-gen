import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		sc.close();

		String[] spl = s.split(" ");
		int[] Wi = new int[spl.length];
		int sum1 = 0;
		int sum2 = 0;

		for(int i = 0;i < Wi.length;i++){
			Wi[i] = Integer.parseInt(spl[i]);
			sum1 += Wi[i];
		}

		int abs = sum1;

		for(int i = 0;i < Wi.length;i++){
			sum1 -= Wi[i];
			sum2 += Wi[i];
			if(abs > Math.abs(sum1 - sum2)){
				abs = Math.abs(sum1 - sum2);
			}
		}
		System.out.println(abs);
	}
}