import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int tblData[] = new int[n];
		
		//?????????????´?
		for(int i = 0; i < n; i++) {
			tblData[i] = sc.nextInt();
		}
		
		//??´???(??????)
		int tmp;
		int k = n - 1;
		while(k > 0) {
			int i = 0;
			while(i < k) {
				if(tblData[i] > tblData[i+1]) {
					tmp = tblData[i];
					tblData[i] = tblData[i+1];
					tblData[i+1] = tmp;
				}
				i++;
			}
			k--;
		}
		
		long sum = 0L;
		for(int i = 0; i < n; i++) {
			sum = sum + tblData[i];
		}
		
		System.out.println(tblData[0] + " " + tblData[n-1] + " " + sum);
	}
}