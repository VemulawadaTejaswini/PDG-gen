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
			int S[]=new int[n];
			int C[];

			int count=0;

			strArray = br.readLine().split(" ");

			for(int i=0; i<n; i++){
				S[i] = Integer.parseInt(strArray[i]);
			}


			while(true){
				C=new int[n];

				for(int i=0; i<n; i++){
					for(int j=0; j<n; j++){
						if(S[i] == S[j]){
							C[i]++;
						}
					}
				}

				if(Arrays.equals(C, S)){
					break;
				}else{
					S=C;
				}
				count++;

			}

			System.out.println(count);

			for(int i=0; i<n; i++){
				if(i != n-1){
					System.out.print(C[i] + " ");
				}else{
					System.out.println(C[i]);
				}
			}

		}
	}
}