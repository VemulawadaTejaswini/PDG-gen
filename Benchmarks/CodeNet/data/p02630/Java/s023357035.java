import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = "";
		for(int i = 0; i < n; i++) {
			str += sc.next();
			str += ",";
		}
		
		int q = sc.nextInt();
		int sum[] = new int[q];
		for(int i = 0; i < q; i++) {
			str = str.replace(sc.next(), sc.next());
			String str2[] = str.split(",", 0);
			for(int j = 0; j < str2.length; j++)
				sum[i] += Integer.parseInt(str2[j]);
		}
		for(int i = 0; i < q; i++)
			System.out.println(sum[i]);
	}
}
