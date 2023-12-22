import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double v[] = new double[n];
		for(int i = 0;i < n;i ++) {
			v[i] = sc.nextDouble();
		}
		//if(n % 2 == 1)n++;
		for(int i = 0; i < n-1; i++) {
			Arrays.sort(v);
			v[i+1] =( v[i] + v[i + 1] )/ 2;
		}
		System.out.println(v[n-1]);
		
		
		

	}

}