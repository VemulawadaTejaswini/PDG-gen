import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		for(int i=0; i<n; i++){
			String strArray[] = br.readLine().split(" ");
			int nballs[] = new int[10];
			int b=0,c=0;
			boolean judge = true;

			for(int j=0; j<nballs.length; j++){
				nballs[j] = Integer.parseInt(strArray[j]);

				if(b<nballs[j]){
					b=nballs[j];
				}else if(c<nballs[j]){
					c=nballs[j];
				}else{
					judge=false;
					break;
				}

			}
			System.out.println(judge ? "YES" : "NO");

		}
	}
}