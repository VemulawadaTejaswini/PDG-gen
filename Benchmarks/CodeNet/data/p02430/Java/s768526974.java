import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		for(int i = 0; i < (1 << n); i++){
			int sum = 0;
			int pow2 = 1;
			int cnt = 0;
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j = 0; j < n; j++){
				if((i & (1 << j)) != 0){
					sum += pow2;
					a.add(j);
					cnt++;
				}
				pow2 *= 2;
			}
			if(cnt != k) continue;
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

