import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int hashA = 97;
	static final int hashEnd = hashA + 26;
	static final int hashPeriod = 46;
	void run() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
		int[] cntAlpha = new int[alphabet.length];
		out: while (true){
			String txt = br.readLine();
			txt = txt.toLowerCase();
			for (int i = 0;i < txt.length();i++){
				char ch = txt.charAt(i);
				int hash = String.valueOf(ch).hashCode();
				if(hash >= hashA && hash <= hashEnd){
					cntAlpha[hash - hashA]++;
				}else if(hash == hashPeriod){
					break out;
				}
			}
		}
		for(int i = 0;i < alphabet.length;i++){
			System.out.println(alphabet[i] + " : " + cntAlpha[i]);
		}
	}
	public static void main(String args[]){
		try{
			new Main().run();
		}catch (IOException e){
			System.out.println(e);
		}
	}
}