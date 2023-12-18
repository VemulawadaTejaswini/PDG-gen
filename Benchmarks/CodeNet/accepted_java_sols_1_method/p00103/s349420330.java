
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] points=new int[n];

		for(int i=0; i<n; i++) {
			int hitCount=0;
			int outCount=0;
			points[i]=0;
			while(outCount<3) {
				String line=br.readLine();
				if("HIT".equals(line)) {
					if(hitCount==3)
						points[i]++;
					else
						hitCount++;
				} else if("HOMERUN".equals(line)) {
					points[i]+=hitCount+1;
					hitCount=0;
				} else {
					outCount++;
				}
			}
		}
		
		for(int i=0; i<n; i++)
			System.out.println(points[i]);

		br.close();
	}
}