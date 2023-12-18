import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		str = br.readLine().split(" ");
		int k = Integer.parseInt(str[0]);
		int[] c = new int[k];
		int[] d = new int[k];
		for(int i = 0; i < k; i++){
			int b = Integer.parseInt(str[i + 1]);
			int pow2 = 1;
			for(int j = 0; j < b; j++) pow2 *= 2;
			c[i] = pow2;
			d[i] = b;
		}
		for(int i = 0; i < (1 << k); i++){
			int sum = 0;
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j = 0; j < k; j++){
				if((i & (1 << j)) != 0){
					sum += c[j];
					a.add(d[j]);
				}
			}
			pw.print(sum + ":");
			if(i > 0) pw.print(" ");
			for(int j = 0; j < a.size(); j++){
				pw.print(a.get(j));
				if(j != a.size() - 1) pw.print(" ");
			}
			pw.print("\n");
		}
		pw.close();
	}
}

