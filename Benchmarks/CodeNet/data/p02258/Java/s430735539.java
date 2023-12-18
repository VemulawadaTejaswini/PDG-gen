import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = readInt(r);
		int[] price1 = new int[n];
		for(int i = 0 ; i < n ; i++) {
			price1[i] = readInt(r);
		}

		int max = 0;
		for(int y = 0 ; y < n ; y++){
			for(int x = y+1; x < n; x++){
				if(y == 0 && x == y+1){
					max = price1[x] - price1[y];
				}else if(max < price1[x] - price1[y]){
					max = price1[x] - price1[y];
				}
			}
		}
		System.out.println(max);
	}

	public static int readInt(BufferedReader r) throws Exception{
		return Integer.parseInt(r.readLine());
	}

}