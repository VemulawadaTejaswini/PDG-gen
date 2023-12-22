import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] scores = new int[n];

			int sum = 0;
			for(int i = 0;i < n;i++){
				scores[i] = sc.nextInt();
				//System.out.print(i + " : ");
				//System.out.println(scores[i]);
				sum += scores[i];
			}

			double ave = (double) sum / n;
			//System.out.println("ave : " + ave);

			double a2 = 0;
			for(int i = 0;i < n;i++){
				a2 += (scores[i] - ave) * (scores[i] - ave);
			}
			a2 /= n;
			double a = Math.sqrt(a2);

			System.out.printf("%.8f\n", a);
		}
		//System.out.println();
	}
}
