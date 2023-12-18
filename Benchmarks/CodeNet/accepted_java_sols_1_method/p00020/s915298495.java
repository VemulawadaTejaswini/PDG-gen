import java.io.*;

 public class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader bf = new BufferedReader(
				 new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] word = str.split(" ", 0);
		//char[]???????????????
		for(int i = 0; i < word.length; i++){
			char[] c = word[i].toCharArray();
			for(int j = 0; j < word[i].length(); j++){
				if(c[j] != '.'){
					c[j] -= 32;
				}
			}
			word[i] = new String(c);
		}
		//???????????????
		String answer = word[0]+" ";
		for(int i = 1; i < word.length-1; i++){
			answer += word[i]+" ";
		}
		answer += word[word.length-1];
		System.out.println(answer);
	}
}