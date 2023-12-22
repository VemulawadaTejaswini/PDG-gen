import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String f = br.readLine();
		int[] a = new int[3];
		for(int i = 0 ; i < Integer.parseInt(f) ; i++){
			String str = br.readLine();
			String[] stra = str.split(" ");
			for(int j = 0 ; j < 3 ; j++){
				a[j] = Integer.parseInt(stra[j]);
			}
			Arrays.sort(a);
			if(Math.pow(a[0],2) + Math.pow(a[1],2) == Math.pow(a[2],2)){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}