import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n  = Integer.parseInt(br.readLine());
		String[] AStr = br.readLine().split(" ");
		int[] Aint = new int[n];

		for(int i = 0 ; i < n ; i++){
			Aint[i] = Integer.parseInt(AStr[i]);
		}

		int j = partation(Aint,0,n);

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n ; i++){
			if(i == j){
				sb.append("[");
				sb.append(String.valueOf(Aint[i]));
				sb.append("]");
				sb.append(" ");
			}else{
				sb.append(String.valueOf(Aint[i]));
				sb.append(" ");
			}
		}

		System.out.println(sb.toString().trim());

	}

	private static int partation(int[] A,int p,int r){

		int x = A[r-1];
		int j = -1; //?????¨???x???????°??????????????????§???indx
		int tmp;
		for(int i = 0; i < r-1 ; i++){
			if(x >= A[i]){
				j++;
				tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}

		j++;
		tmp = A[r-1];
		A[r-1] = A[j];
		A[j] = tmp;
		return j;
	}

}