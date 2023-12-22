import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int[] data = new int[5];
		for(int i =  0 ; i < 5 ; i++){
			data[i] = Integer.parseInt(a[i]);
		}
		Arrays.sort(data);
		for(int i = 4 ; i != -1 ; i --){
			System.out.print((i==0)?data[i]:data[i]+" ");
		}
		System.out.println("");
	}
}