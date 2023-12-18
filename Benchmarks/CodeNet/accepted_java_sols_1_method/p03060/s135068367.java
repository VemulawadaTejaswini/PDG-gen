import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int V_i[] = new int[N];
		int C_i[] = new int[N];
		int sum = 0;
		for(int i = 0; i<N ;i++) {
			V_i[i] = sc.nextInt();
		}
		for(int i = 0; i<N; i++) {
			C_i[i] = sc.nextInt();
		}
		for(int i = 0; i<N; i++) {
			int p = V_i[i]-C_i[i];
			if(p >0)sum+=p;
		}
		
		System.out.println(sum);
	}
	

}
