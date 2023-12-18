import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sumb = 0;
		int n = 0;
		int ava = 0;
		while(sc.hasNext()){
			n++;
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += (a * b);
			sumb += b;
			ava = sumb / n;
			//BigDecimal bd = new BigDecimal(ava);
			//BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
			System.out.println(sum + "\n" + ava);
		}
	}
}