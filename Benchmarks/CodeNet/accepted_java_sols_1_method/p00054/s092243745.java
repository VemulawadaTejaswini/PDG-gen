import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];
		int a,b,n,temp;

		while((str=br.readLine()) != null){
			int sum=0,r=1;
			strArray = str.split(" ");
			a = Integer.parseInt(strArray[0]);
			b = Integer.parseInt(strArray[1]);
			n = Integer.parseInt(strArray[2]);
		    sum=0;
			temp=a%b;

			for(int i=0; i<n; i++){
				sum += temp*10/b;
				temp = temp*10%b;
			}
			System.out.println(sum);
		}
	}
}