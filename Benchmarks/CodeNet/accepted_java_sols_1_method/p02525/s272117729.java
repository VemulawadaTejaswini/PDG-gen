import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
				if(n == 0)break;
				int[] s = new int[n];
				double total = 0;
					for(int i = 0;n != i;i++){
						s[i] = sc.nextInt();
						total = total + s[i];
					}
				double average = total / n;
				double[] sa = new double[n];
				double sa_total = 0;
					for(int i = 0;n != i;i++){
						sa[i] = (s[i] - average)*(s[i] - average);
						sa_total = sa_total + sa[i];
					}
				double result = sa_total / n;
				System.out.println(Math.sqrt(result));
		}
	}
}