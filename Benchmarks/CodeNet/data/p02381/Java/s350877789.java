import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("0.########");
		
		
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int s[] = new int[n];
			int i, m;
			int sum = 0;
			int x = 0;
			for(i = 0; i < n; i++){
				s[i] = sc.nextInt();
				sum = sum + s[i];
			}
			m = sum / n;
			for(i = 0; i < n; i++){
				x = s[i] * s[i] - 2 * s[i] * m + m * m;
			}
			double a = Math.sqrt(x / n);
			System.out.println(df1.format(a));
		}
	}
}
