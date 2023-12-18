import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i,m;
		int[] n = new int[990];
		String[] str = new String[990];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		m = Integer.parseInt(str[0]);
		str = in.readLine().split(" ");
		for(i=0;i<m;i++){
			n[i] = Integer.parseInt(str[i]);
		}
		for(i=m-1;i>=0;i--){
			if(i!=m-1) System.out.print(" "); 
			System.out.print(n[i]);
		}
		System.out.println();
		System.out.flush();
	}
}