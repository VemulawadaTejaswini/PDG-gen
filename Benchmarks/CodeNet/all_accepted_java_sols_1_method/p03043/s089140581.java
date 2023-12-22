import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int N, K;
			N = sc.nextInt();
			K = sc.nextInt();
			
			double sum = 0;
			
			for (int i = 1; i <= N; i++) {
				int score = i;
				double tmpSum = 1;
//				System.out.println("K = " + i + ";");
				while (score < K) {
					score *= 2;
					tmpSum *=  0.5;
//				System.out.println(score);
					
				}
				sum += tmpSum;
			}
			
			sum = (double)(sum / N);
			
			System.out.println(String.format("%.9f", sum));
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
