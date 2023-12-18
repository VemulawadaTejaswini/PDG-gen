import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	static int[] alphaCounter = new int[26];
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line;
		while(!(line = br.readLine()).equals(null) && !(line.equals(""))){
			char[] ch = line.toCharArray();
			for(int i=0; i<ch.length; i++){
				int n = Character.toLowerCase(ch[i]) - 97; //"a" is (int) 97
				try{
				alphaCounter[n] += 1;
				} catch(Exception e){}
			}
			}System.out.println(12);
		char[] ch2 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i = 0; i<26; i++){
			System.out.println(ch2[i]+" : "+alphaCounter[i]);
		}
		} catch(Exception e){
			//e.printStackTrace();
			}
	}
}