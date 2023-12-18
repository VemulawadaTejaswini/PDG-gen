import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while((str=br.readLine()) != null){
			int n = Integer.parseInt(str);
			int count = 0;
			int prime[] = new int[n];

			if(n==2){
				count = 1;
			}else if(n==3){
				count = 2;
			}else{
				for(int i=2; i<n; i++){
					if(prime[i]==0){
						for(int j=i*2; j<n; j = j+i){
							prime[j]=1;
						}
					}
				}
				for(int i=2; i<n; i++){
					if(prime[i]==1){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}