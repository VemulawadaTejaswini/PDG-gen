import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
	final static int Code = 20;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] A, B;
		boolean find = false;
		//??\?????¨??¨??????char???????????£??\
		A = br.readLine().toCharArray();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			B = br.readLine().toCharArray();
			//A??????????????????????????????
			if(A.length < B.length) {
				System.out.println("0");
				continue;
			}
	
			int t = 0;
			int p = 0;
			int BN = search(Code, B.length);
	
			for(int j = 0; j < B.length; j++){
				t = t * Code + A[j];
				p = p * Code + B[j];
			}
			find = Print(t ,p, A, B, BN);
			
			if(find) System.out.println("1");
			else System.out.println("0");
		}
		return;
	}

	public static int search(int x, int n){
		if(n == 0) return 1;
		int ret = search(x * x, n / 2);
		//??????????????????AND?????????
		if((n & 1) == 1) ret *= x;
		return ret;
	}

	public static boolean Print(int t, int p, char[] A, char[] B, int BN){
		//t??¨p?????????????????????????????¨???
		if(t == p) return true;
		for(int i = 1; i < A.length - B.length + 1; i++){
			t = t * Code + A[i + B.length - 1] - A[i - 1] * BN;
			if(t == p) return true;
		}
		return false;
	}
}