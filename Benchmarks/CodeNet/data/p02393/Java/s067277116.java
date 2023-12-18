
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
		arr = sorted(arr);
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i!= arr.length-1){
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	public static int[] sorted(int[] array){
		int[] ar = array;
		int temp = 0;
		for(int i = 0 ; i < array.length; i++){
			for(int j = i+1 ; j < array.length;j++){
				if(ar[i] > ar[j]){
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		return ar;
	}

}