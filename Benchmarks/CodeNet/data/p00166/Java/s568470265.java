import java.util.*;
public class Main {

	public void doIt(){
		final double EPS = 1.0e-08;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			//第1
			double sum1 = 0;
			int degMem = 0;
			for(int i=0; i < n-1 ; i++){
				double deg = sc.nextDouble();
				double s = Math.sin(deg / 360 * Math.PI);
				sum1 += s;
				degMem += deg;
			}
			degMem = 360 - degMem;
			sum1 += Math.sin(degMem / 360 * Math.PI);

			//第2
			n = sc.nextInt();
			double sum2 = 0;
			degMem = 0;
			for(int i=0; i < n-1 ; i++){
				double deg = sc.nextDouble();
				double s = Math.sin(deg / 360 * Math.PI);
				sum2 += s;
				degMem += deg;
			}
			degMem = 360 - degMem;
			sum2 += Math.sin(degMem / 360 * Math.PI);

			//比較
			if((sum1 - sum2) > EPS)
				System.out.println(1);
			else if(Math.abs(sum1 - sum2) < EPS)
				System.out.println(0);
			else
				System.out.println(2);
			n = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}