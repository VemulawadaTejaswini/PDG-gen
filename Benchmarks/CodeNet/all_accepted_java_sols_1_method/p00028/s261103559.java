import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num[] = new int[101];
		int value=0;

		while((str=br.readLine()) != null){
			num[Integer.parseInt(str)]++;
		}

		for(int i=1; i<=100; i++){
			if(num[i]>value){
				value = num[i];
			}
		}

		for(int i=1; i<=100; i++){
			if(num[i]==value){
				System.out.println(i);
			}
		}

	}
}