import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] x = new int[N];
		int[] y = new int[N];
		
		double sum = 0;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<N;j++) {
				if(i==0) {
					x[j] = sc.nextInt();
				}else {
					y[j] = sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<N;i++) { //p=1
			sum += Math.abs((x[i] - y[i]));
		}
		System.out.printf("%6f\n",sum);
		sum = 0;
		
		for(int i=0;i<N;i++) { //p=2
			sum += Math.pow(Math.abs(x[i] - y[i]),2);
		}
		sum = Math.sqrt(sum);
		
		System.out.printf("%6f\n",sum);
		sum = 0;
		
		for(int i=0;i<N;i++) { //p=3
			sum += Math.pow(Math.abs(x[i] - y[i]),3);
		}
		sum = Math.cbrt(sum);
		
		System.out.printf("%6f\n",sum);
		sum = 0;
		
		double max = -7000;
		
		for(int i=0;i<N;i++) { //p = infinity
			sum = Math.abs((x[i] - y[i]));
				if(sum > max) max = sum;
		}
		System.out.printf("%6f\n",max);
	}

}
