import java.io.*;
import java.util.*;

public class Main{
	private static boolean isPalindrome(String s){
		int n = s.length();
		for(int i=0;i<n/2;i++){
			if(s.charAt(i) != s.charAt(n-i-1)) return false;
		}
		return true;
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(br.ready()){
			String s = br.readLine().toUpperCase().replaceAll("[^A-Z]","");
			int n = s.length();
			TreeSet<String> set = new TreeSet<String>();
			HashSet<String> bad = new HashSet<String>();
			boolean[][] flg = new boolean[n][n];

			for(int i=n;i>=3;i--){
				for(int j=0;j<=n-i;j++){
					if(flg[j][j+i-1]) continue;
					String sub = s.substring(j,j+i);
					if(isPalindrome(sub) && !bad.contains(sub)){
						set.add(sub);
						for(int k=0;k<i/2;k++){
							flg[j+k][j+i-k-1] = true;
							bad.add(sub.substring(k,i-k));
						}
					}
				}
			}

			System.out.println(set.toString().replaceAll("\\[|\\]|,",""));
		}
	}
}