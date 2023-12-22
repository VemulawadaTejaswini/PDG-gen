import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String first = br.readLine();
		int[] a = new int[Integer.parseInt(first)];
		String str = br.readLine();
		String[] stra = str.split(" ");
		for (int i = 0 ; i < a.length ; i++){
			a[i] = Integer.parseInt(stra[i]);
		}
		for (int i = a.length-1 ; i >= 0 ; i--){
			System.out.print(a[i]);
			if ( i == 0) break;
			System.out.print(" ");
		}
		System.out.println();
	}

}