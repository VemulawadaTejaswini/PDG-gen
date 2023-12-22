import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		int[] count = new int[26];
		String str = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		while((str = br.readLine()) != null){
			for(int i = 0; i < str.length(); i++){
				final char ch = str.charAt(i);
				if('A' <= ch && ch  <= 'Z'){
					count[ch - 'A']++;
				} else if('a' <= ch && ch <= 'z'){
					count[ch - 'a']++;
				} else {}
			}
		}

		for(int i = 0; i < count.length; i++){
			sb.append(String.valueOf((char)('a'+i))).append(" : ").append(count[i]).append(lb);
		}
		System.out.print(sb.toString());
	}
}