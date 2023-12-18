import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];
		int seg[] = new int[10];
		int v1,v2,sum=0,ans;

		while((str=br.readLine()) != null){
			strArray = str.split(",");

			for(int i=sum=0; i<10; i++){
				seg[i] = Integer.parseInt(strArray[i]);
				sum += seg[i];
			}

			v1 = Integer.parseInt(strArray[10]);
			v2 = Integer.parseInt(strArray[11]);

			ans = sum*v2/(v1+v2);

			for(int i=9; i>=0; i--){
				ans -= seg[i];
				if(ans<0){
					System.out.println(i+1);
					break;
				}
			}

		}

	}
}