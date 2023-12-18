import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strArray[],indexArray[];
		int tarop=0,hanap=0;

		int n=Integer.parseInt(str);
		for(int i=0; i<n; i++){
			str=br.readLine();

			strArray = str.split(" ");

			if(strArray[0].equals(strArray[1])){
				tarop += 1;
				hanap += 1;
			}else{
				indexArray = str.split(" ");
				Arrays.sort(indexArray);
				if(strArray[0].equals(indexArray[1])){
					tarop += 3;
				}else{
					hanap += 3;
				}
			}
		}
		System.out.println(tarop + " " + hanap);
	}
}