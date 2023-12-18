import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] x = new double[N];
		String[] u = new String[N];
		String empty = sc.nextLine();
		for (int i=0;i<N;i++) {
			String str = sc.nextLine();
			String[] str1 = str.split(" ");
			x[i]=Double.parseDouble(str1[0]);
			u[i]=str1[1];
		}

		double sum = 0;
		for (int i=0;i<N;i++) {
			if (u[i].equals("JPY")) {
				sum+=x[i];
			}else {
				sum+=x[i]*380000;
			}
		}
		System.out.println(sum);
	}
}