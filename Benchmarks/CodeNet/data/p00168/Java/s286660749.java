
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	private static int A[] = new int[31];

	public static void main(String[] args) throws Exception {
		//Aiはi段目までの登り方の総数
		A[0] = 1;
		A[1] = 1;
		A[2] = A[0]+A[1];
		for(int i=3; i<A.length; i++) {
			for(int j=0; j<3; j++) {
				A[i] +=  A[i+j-3];
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) break;
			System.out.println(year(N));
		}
	}

	private static int year(int n) {
		double year = A[n]/10.0/365;
		return (int)Math.ceil(year);
	}

}

