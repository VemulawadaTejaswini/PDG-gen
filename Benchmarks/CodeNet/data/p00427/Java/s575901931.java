import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static final int MOD = 10;
	static final int LOG = 11000;
	//10????????§
	static int numerator[] = new int [LOG];
	static int answer[] = new int [LOG];
	//1?????????????????£???????¶????????????§[4]???1??????

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			Arrays.fill(numerator, 0);
			Arrays.fill(answer, 0);
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			boolean m = line[2].equals("1");
			int r = Integer.parseInt(line[3]);
			if(n==0){break;}
			numerator[4] = 1;
			answer[4] = 1;
			if(m){
				for(int i=1; i<n; i++){
					Arrays.fill(numerator, 0);
					numerator[4] = 1;
					div(numerator,i);
					add(answer,numerator);
				}
			}

			div(answer,n);
			System.out.print(answer[4]+".");
			for (int i=1; i<=r; i++){
				System.out.print(answer[4+i]);
			}
			System.out.println();
		}
	}

	//hoge is 10k at most
	static void div(int[] base, int hoge){
		int carry = 0;
		for(int i=0; i<LOG; i++){
			base[i] += carry*MOD;
			carry = (base[i]%hoge);
			base[i] /= hoge;
		}
	}

	static void add(int[] base, int[] hoge){
		int carry = 0;
		for(int i=LOG-1; i>=0; i--){
			base[i]+=hoge[i]+carry;
			carry = base[i]/MOD;
			base[i] %= MOD;
		}
	}
}