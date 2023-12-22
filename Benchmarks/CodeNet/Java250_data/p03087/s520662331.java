import java.util.*;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		String S = br.readLine();
		int []PrefixSumArr = new int[S.length() + 1];
		for(int i =1; i<S.length(); i++) {
			if(S.charAt(i-1)=='A' && S.charAt(i) == 'C') {
				PrefixSumArr[i]++;
			}
		}
		
		for(int i = 1; i<=S.length(); i++) PrefixSumArr[i] += PrefixSumArr[i-1];
		for(int i =0; i<Q; i++) {
			st = new StringTokenizer(br.readLine());
			int length = Integer.parseInt(st.nextToken());
			int row = Integer.parseInt(st.nextToken());
			int counter = PrefixSumArr[row-1] - PrefixSumArr[length-1];
			System.out.println(counter);
		}
			
		
	}
 
}