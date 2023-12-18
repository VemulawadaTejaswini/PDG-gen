import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] d = new double[100001];
		double[] s = new double[100001];
		d[1] = 1;
		s[1] = 1;
		
		double e = 0.5;
		for(int i=2;i<100001;i++){
			d[i] = d[i-1]*(1-e);
			s[i] = s[i-1]+(1-d[i]);
			e *= 0.5;
		}
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			System.out.printf("%.8f\n", s[n]);
		}
	}

}