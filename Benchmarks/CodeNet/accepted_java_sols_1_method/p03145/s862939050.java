import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tri[] = new int[3];
		String str = br.readLine();
		String[] str2 = str.split(" ");
		for (int i=0; i < str2.length;i++){
			tri[i] = Integer.parseInt(str2[i]);
		}
		Arrays.sort(tri);
		int S = tri[0]*tri[1]/2;
		System.out.println(S);
		
	}
}
