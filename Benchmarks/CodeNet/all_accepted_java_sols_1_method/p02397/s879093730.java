import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i;
		int[] n = new int[5];
		String[] str = new String[5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			str = in.readLine().split(" ");
			for(i=0;i<2;i++){
				n[i]=Integer.parseInt(str[i]);
			}
			if(n[0]==0 && n[1]==0) break;
			System.out.println((n[0]>n[1]?n[1]:n[0])+" "+(n[0]>n[1]?n[0]:n[1]));
		}
	}
}