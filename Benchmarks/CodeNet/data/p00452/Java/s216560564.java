import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);
			if (n==0) {break;}

			int[] onelist = new int [n+1];
			for(int i=1; i<=n; i++){
				onelist[i] = Integer.parseInt(br.readLine());
			}

			int[] twolist = new int [(n+2)*(n+1)/2];
			for(int i=0; i<=n; i++){
				for(int j=i; j<=n; j++){
					twolist[i*(n+1)-i*(i+1)/2 + j] = onelist[i] + onelist[j];
				}
			}
			Arrays.sort(twolist);

			int maxi = (n+2)*(n+1)/2-1;
			KOKO: for(int i=0; i<m; i++){
				for(int j=0; j<=maxi; j++){
					while(twolist[j]+twolist[maxi] > m-i ){maxi--;}
					if (twolist[j] + twolist[maxi] == m-i){
						System.out.println(m-i);
						break KOKO;
					}
				}
			}
		}
	}
}