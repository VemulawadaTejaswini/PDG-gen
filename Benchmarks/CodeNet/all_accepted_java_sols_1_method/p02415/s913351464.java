import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		StringBuilder out=new StringBuilder();
		String w;
		for (int i=0;i<word.length();i++){
			w=word.substring(i,i+1);
			if(w.equals(w.toLowerCase())){
				w=w.toUpperCase();
			}else if(w.equals(w.toUpperCase())){
				w=w.toLowerCase();
			}
		out.append(w);
		}
		System.out.println(out);
	}
}