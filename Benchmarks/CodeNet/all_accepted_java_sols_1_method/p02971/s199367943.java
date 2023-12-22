import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		int i, max, semiMax;
		max = semiMax = 0;
		for(i=0; i<n; i++){
			array[i] = Integer.parseInt(br.readLine());
			if( max < array[i] ){
				semiMax = max;
				max = array[i];
			}else if( semiMax < array[i] ){
				semiMax = array[i];
			}
		}
		
		for(i=0; i<n; i++)
			if( array[i] == max )
				System.out.println(semiMax);
			else
				System.out.println(max);
	}
}
