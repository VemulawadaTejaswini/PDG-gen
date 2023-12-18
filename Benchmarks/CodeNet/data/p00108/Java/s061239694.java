import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];

		while(!(str=br.readLine()).equals("0")){
			int n = Integer.parseInt(str);
			int S[]=new int[n+1];

			int P[]=new int[n+1];
			int count=0;
			String result = "";

			strArray = br.readLine().split(" ");

			for(int i=0; i<n; i++){
				S[i+1] = Integer.parseInt(strArray[i]);
			}


			while(true){

				int C[]=new int[n+1];
				for(int i=1; i<=n; i++){
					for(int j=1; j<=n; j++){
						if(S[i] == S[j]){
							C[i]++;
						}
					}
				}

				if(Arrays.equals(C, P)){
					break;
				}else{

					S=C;
					P=C;
				}
				count++;

			}

			System.out.println(count);

			for(int i=1; i<=n; i++){
				if(i != n){
					System.out.print(P[i] + " ");
				}else{
					System.out.println(P[i]);
				}
			}

		}
	}
}