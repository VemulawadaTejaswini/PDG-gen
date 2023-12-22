import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
//			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//			String W = in.readLine();
//
//			int N= Integer.parseInt(W.split(" ")[0]);
//			int M= Integer.parseInt(W.split(" ")[1]);
		Scanner sc = new Scanner(System.in);
			int N  = sc.nextInt();
			int M= sc.nextInt();
//			int[] A = new int[M];
			int homework =0;

			for(int i=0;i<M;i++) {
				homework+= sc.nextInt();
			}

			int ans = N - homework;

			if(ans >=0) {
				System.out.println(ans);
			}else {
				System.out.println(-1);
			}

	}

}
