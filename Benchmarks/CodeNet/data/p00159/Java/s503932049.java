import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int num = 0;
			double bmi = Double.MAX_VALUE;
			for(int i=0;i<n;i++){
				int tn = stdIn.nextInt();
				double tall = stdIn.nextInt()*0.01;
				int weight = stdIn.nextInt();
				double t_bmi = weight/(tall*tall);
				double sa = Math.abs(t_bmi-22);
				if(bmi>sa){
					num = tn;
					bmi = sa;
				}
			}
			System.out.println(num);
		}
	}
}