import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 int T [] = new int [n+1];
		 for (int i=1; i<n+1; i++) T[i] = Integer.parseInt(br.readLine());
		
		 T[0]=-1;
		 int L [] = new int [n+1];
		 for (int i=1; i<n+1; i++){
			 int k=0;
			 for (int j=0; j<i; j++){
				 if (T[j]<T[i] & L[j]>L[k]) k=j;
			 }
			 L[i] = L[k]+1;
		 }
		int maxvalue = 0;
		for (int i = 0; i<n+1; i++){
			if (maxvalue<L[i]) maxvalue=L[i];
		}
		System.out.println(maxvalue);
	}
}