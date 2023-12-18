import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int hmax = -1;
			double m = 0;
			double max = 0;
			int y = sc.nextInt();
			for(int i = 0 ; i < n ;i++){
				int b = sc.nextInt();
				int r = sc.nextInt();
				int t = sc.nextInt();
				if(t == 1){
					m = 1+y*r/100.;
				} else {
					m = Math.pow(1 + r/100.,y);
				}
				if(max < m ){
					max = m; 
					hmax = b;
				}
			}
			System.out.println(hmax);
		}
		sc.close();
	}

}