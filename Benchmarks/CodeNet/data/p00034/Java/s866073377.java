import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[] result = new int[10000];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				String[] s = str.split(",");
				int[] x = new int[s.length];
				for(int i = 0; i < x.length; i++){
					x[i] = Integer.parseInt(s[i]);
				}
				int v = x[10]+x[11];
				int l = 0;
				int[] length = new int[10];
				for(int i = 0; i < 10; i++){
					l += x[i];
				}
				length[0] = x[0];
				for(int i = 1; i < 10; i++){
					length[i] = length[i-1]+x[i];
				}
				double t = (double) l/v;
				double key = t*x[10];
				for(int i = 0; i < 10; i++){
					if( key <= length[i] ){
						result[index] = i+1;
						break;
					}
				}
				index++;
			}
			for(int i = 0; i < index; i++){
				System.out.println(result[i]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}