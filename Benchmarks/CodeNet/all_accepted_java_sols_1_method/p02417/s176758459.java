import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alp = new int[26];
		String str;
		while(( str = br.readLine())!=null){
			str = str.toLowerCase();
			for(int i=0;i<str.length();i++){
				char alp_num = str.charAt(i);
				if('a'<= alp_num && alp_num <= 'z'){
					alp[alp_num - 'a']++;
				}
			}
		}
		for(int i=0;i <26;i++){
			System.out.println((char)('a' + i)+" : "+alp[i]);
		}
	}
}
	