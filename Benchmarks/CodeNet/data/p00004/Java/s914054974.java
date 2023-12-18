import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//0-a, 1-b, 2-c, 3-d, 4-e, 5-f
		double[] ar = new double[6] ;
		double x,y;
		String str=br.readLine();
		StringTokenizer st;

		int i=0;
		while(str!=null){
			st = new StringTokenizer(str);
			while(st.hasMoreTokens()){
				ar[i] = Double.parseDouble(st.nextToken());
				i++;
			}
			x = (ar[2]*ar[4] - ar[1]*ar[5])/(ar[0]*ar[4] - ar[1]*ar[3]);
			y = (ar[2] - (ar[0]*x))/ar[1];
			
			if(x==-0.0){
				x=0;
			}
			if(y==-0.0){
				y=0;
			}
			System.out.printf("%.3f %.3f\n",x,y);
			str = br.readLine();
			i=0;
		}

	}

}