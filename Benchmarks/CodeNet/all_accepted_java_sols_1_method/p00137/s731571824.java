import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		long d[] = new long[x];
		for(int i = 0 ; i < x ; i++){
			d[i] = scan.nextLong();
		}
		for(int i = 0 ; i < x ; i++){
			System.out.println("Case " + (i+1) + ":");
			for(int j = 0 ; j < 10 ; j++){
				long ExponentiationA = d[i]*d[i];
				String text = "00000"+String.valueOf(ExponentiationA);
				String getText = text.substring(text.length()-6, text.length()-2);
				d[i] = Integer.parseInt(getText);
				System.out.println(d[i]);
			}
		}
	}
}