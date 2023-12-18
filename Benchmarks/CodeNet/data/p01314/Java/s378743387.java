import java.util.*;

public class Main {
	public static void main(String[] args){
		new Main().calc();
	}

	void calc(){
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			int ret = 0;
			for(int i=2;i<=n;i++){
				int min = (int)((double)n/i - 0.5 * (i-1) + 1e-6);
				if(min * i + i * (i-1) /2 == n) ret++;
			}
			System.out.println(ret);
		}
	}
}