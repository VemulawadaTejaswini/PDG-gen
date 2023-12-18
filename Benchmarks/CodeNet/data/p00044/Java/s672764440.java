import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while((str=br.readLine()) != null){
			int n = Integer.parseInt(str);
			int un=0,ri=0;

			boolean prime[] = new boolean[50001];
			prime[0]=true;

			for(int i=2; i<=50000; i++){
				if(!prime[i]){
					for(int j=i*2; j<=50000; j=j+i){
						prime[j]=true;
					}
				}
			}

			for(int i=0; i<prime.length; i++){
				if(!prime[i] && i<n){
					un = i;
				}else if(!prime[i] && i>n){
					ri=i;
					break;
				}
			}

			System.out.println(un + " " + ri);

		}

	}
}