import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

//		StringTokenizer st = new StringTokenizer(str," ");
		
		String[] strAry = str.split(" ");
		
		int ar[] = new int[3];

		for (int i=0;i<3;i++){
			 ar[i] = Integer.parseInt(strAry[i]);
		}
		
		Arrays.sort(ar);			
		System.out.println(ar[0] +" "+ar[1]+" "+ar[2] );
	}
}