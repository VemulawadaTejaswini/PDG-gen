import java.io.*;
import java.util.*;


class Main {
	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		long sum = 0;
		String[] cut = br.readLine().split(" ");
		
		for (int i=0;i<n;i++) {
			int r =Integer.parseInt(cut[i]);
			if(max<r){
				max=r;
			}
			if(min>r){
				min=r;
			}
			sum+=r;
		}	
		System.out.println(min+" "+max+" "+sum);
	
		

	}
}