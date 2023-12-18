import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int i = 0;
			double var = 0;
			double ave = 0;
			int n = sc.nextInt();
			if(n == 0) break;
			int[] s = new int[n];
			while(true){
				if(i == n) break;
				s[i] = sc.nextInt();
				i++;
			}

			for(i = 0;i < s.length;i++){
				ave += s[i];
			}
			ave /= n;

			for(i = 0;i < s.length;i++){
				var += (s[i] - ave)*(s[i] - ave);
			}
			var /= n;

			System.out.println(Math.sqrt(var));
		}
	}
}