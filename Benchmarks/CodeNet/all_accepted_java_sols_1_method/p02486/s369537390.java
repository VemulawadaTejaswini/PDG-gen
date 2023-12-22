import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n,x,count;

		while(true){
			str = br.readLine();
			count = 0;

			if(str.equals("0 0"))
				break;

			n = Integer.parseInt(str.substring(0, str.indexOf(" ")));
			x = Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length()));

			for(int i=1; i<=n; i++){
				for(int j=i+1; j<=n; j++){
					for(int k=j+1; k<=n; k++){
						if(i+j+k == x){
							count++;
						}
					}
				}
			}

			System.out.println(count);

		}
	}
}