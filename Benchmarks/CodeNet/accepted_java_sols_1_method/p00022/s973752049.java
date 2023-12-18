import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		while(true){
			int N = Integer.parseInt(bf.nextLine());
			if(N==0) break;
			int use = 0;
			int useMax = 0;
			int nonuseMax = 0;
			int max = Integer.MIN_VALUE;
			for(int i=0; i<N; i++){
				int tmp = Integer.parseInt(bf.nextLine());
				max = Math.max(tmp,max);
				use = Math.max(0, use + tmp);
				nonuseMax = Math.max(nonuseMax, useMax);
				useMax = Math.max(use, useMax);
			}
			int ans = Math.max(useMax, nonuseMax);
			if(ans <= 0) ans = max;
			System.out.println(ans);
		}
	}
}