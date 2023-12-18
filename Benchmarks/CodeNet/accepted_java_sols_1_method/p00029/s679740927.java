import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> words = new ArrayList<String>();
		int size = 0;
		ArrayList<String> ans = new ArrayList<String>();
		int[] cnt = new int[1000];
		
		int maxLen = Integer.MIN_VALUE;
		String maxWord = "";
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while (st.hasMoreTokens()) {
			
			String tmp = st.nextToken();
			if (tmp.length() > maxLen) {
				maxLen = tmp.length();
				maxWord = tmp;
			}
			if (!words.contains(tmp)) {
				words.add(tmp);
			}
			cnt[words.indexOf(tmp)]++;
			size++;
			
		}
		
		int max = 0;
		for (int c : cnt)
			max = Math.max(c, max);
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == max) {
				System.out.println(words.get(i) + " " + maxWord);
				break;
			}
		}
		
//		for (String a : ans)
//			System.out.println(a);
	}
	
}