import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int hashA = 97;
	static final int hashPeriod = 46;
	void run() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
		int[] cntAlpha = new int[alphabet.length];
		String txt = br.readLine();
		while( txt != null && ! "".equals(txt) ){
			for (int i = 0;i < txt.length();i++){
				txt = txt.toLowerCase();
				char ch = txt.charAt(i);
				int hash = String.valueOf(ch).hashCode();
				if(hash >= hashA && hash < hashA + alphabet.length){
					cntAlpha[hash - hashA]++;
				}
			}
			txt = br.readLine();
		}
		for(int i = 0;i < alphabet.length;i++){
			System.out.println(alphabet[i] + " : " + cntAlpha[i]);
		}
	}
	public static void main(String args[]) throws IOException{
		new Main().run();
	}
}