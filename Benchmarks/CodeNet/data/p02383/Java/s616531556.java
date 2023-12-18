import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int[] in = new int[6];
		for(int i = 0; i < 6; i++){
			in[i] = scan.nextInt();
		}
		int T = in[0];
		int S = in[1];
		int E = in[2];
		int W = in[3];
		int N = in[4];
		int U = in[5];
		String com = scan.next();
		int len = com.length();
		for(int i = 0; i < len; i++){
			int dir =com.charAt(i);
			if(dir.equals("S")){
				int a = T;
				T = N;
				N = U;
				U = S;
				S = a;
			}
			if(dir.equals("E")){
				int a = T;
				T = W;
				W = U;
				U = E;
				E = a;
			}
			if(dir.equals("N")){
				int a = T;
				T = S;
				S = U;
				U = N;
				N = a;
			}
			if(dir.equals("W")){
				int a = T;
				T = E;
				E = U;
				U = W;
				W = a;
			}
		}
		System.out.println(T);
	}
}