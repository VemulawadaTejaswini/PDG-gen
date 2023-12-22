import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


			String[] str = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);
			int[] csum= new int[c + 1];

			for(int i = 0; i<r; i++){
				str = br.readLine().split(" ");
				int value=0;
				for(int j = 0; j<c; j++ ){
					value += Integer.parseInt(str[j]);
					csum[j] += Integer.parseInt(str[j]);
					System.out.print(str[j] + " ");
				}
				System.out.println(value);
			}
			for(int i=0;i<c;i++){
				csum[c] += csum[i];
				System.out.print(csum[i] + " ");
			}
			System.out.println(csum[c]);


	}
}