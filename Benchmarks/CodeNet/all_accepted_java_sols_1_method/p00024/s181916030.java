import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String str;
		int count = 0;
		double mv,v;
		List<Integer> result = new ArrayList<>();
		while(true){
			str = br.readLine();
			if(str == null) break;
			mv = (double)Double.parseDouble(str);
			for(int N = 1;; N++){
				v = 1.4*Math.sqrt(10*(5*N-5));
				if(v > mv){
					result.add((Integer)N);
					count++;
					break;
				}
			}
		}
		for(int i = 0; i < count; i++){
			System.out.println(result.get(i));
		}
	}
}