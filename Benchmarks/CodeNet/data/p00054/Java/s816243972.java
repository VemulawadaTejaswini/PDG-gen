import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		while (sc.hasNext()) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			int n = sc.nextInt();

			double c = a / b;

			String kei = "";
			long kei2 =0;


			long ans = 0;

			for (int i = 1; i <= n; i++) {
				kei = String.valueOf(c * (Math.pow(10, i)));
				kei2=raund(kei)%10;
				ans = ans + kei2;
			}
			System.out.println(ans);
		}

	}

	public static long raund(String kei){
		//String str =String.valueOf(kei);
		String [] st =kei.split("\\.");
		//String [] st2 = st[0].split("");
		long num = Integer.parseInt(st[0]);
		return num;
		//System.out.println(str);

	}

}