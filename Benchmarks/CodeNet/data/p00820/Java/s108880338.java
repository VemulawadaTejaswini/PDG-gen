import java.util.*;

public class Main{
	public static void main(String[] args){
		final int MAX = 1 << 15;
		Scanner sc = new Scanner(System.in);
		int[] ans = new int[MAX+1];

		for(int i=0;i*i<=MAX;i++){
			for(int j=i;j*j<=MAX;j++){
				for(int k=j;k*k<=MAX;k++){
					for(int l=k;l*l<=MAX;l++){
						if(i*i+j*j+k*k+l*l <= MAX) ans[i*i+j*j+k*k+l*l]++;
					}
				}
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(ans[n]);
		}
	}
}