
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int[] arr = new int[3];
		arr[0] = Integer.parseInt(s[0]);
		arr[1] = Integer.parseInt(s[1]);
		arr[2] = Integer.parseInt(s[2]);
		int a,b = 0,c;
		a = Math.max(arr[0], Math.max(arr[1],arr[2]));
		c =Math.min(arr[0], Math.min(arr[1],arr[2]));
		for(int i = 0 ; i < arr.length ; i++){
			if(a != arr[i] && c != arr[i]){
				b = arr[i];
			}
		}
		System.out.println(c+" "+b+" "+a);
	}

}