import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long n = sc.nextLong();

			StringBuilder sb = new StringBuilder();
			

			while (n > 26) {
				long amari = (n % 26) ;
				if(amari == 0) amari = 26;
				sb.insert(0, (char)(amari + 96));
				n = (n-1) / 26l;
			}
			
			long amari1 = n % 26;
			if(amari1 == 0) amari1 = 26;
			sb.insert(0, (char)(amari1 + 96));
			n = (n-1) / 26;

			System.out.println(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
