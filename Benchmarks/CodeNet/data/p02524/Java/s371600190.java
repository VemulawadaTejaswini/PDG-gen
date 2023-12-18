
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strArray = str.split(" ");
		double para[] = new double[3];
		double S,L,h;

		for(int i=0; i<strArray.length; i++){
			para[i] = Double.parseDouble(strArray[i]);
		}

		S = (para[0]*para[1]*Math.sin(Math.toRadians(para[2])))/2;
		L = para[0]+para[1]+Math.sqrt(Math.pow(para[0], 2) + Math.pow(para[1], 2) - 2*para[0]*para[1]*Math.cos(Math.toRadians(para[2])));
		h = para[1]*Math.sin(Math.toRadians(para[2]));

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}