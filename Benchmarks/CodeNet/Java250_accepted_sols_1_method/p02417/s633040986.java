import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int[] counter = new int[26];
			String line; 
			//line = br.readLine();
			char ch = 'a';
			//char[] c = line.toCharArray();
			while((line = br.readLine())!=null){
				char[] c = line.toCharArray();
				for(int i = 0; i < c.length; i++){
					if( c[i] >= 'A' && c[i] <= 'z' ){
						if( Character.isUpperCase(c[i]) ){
							c[i] = Character.toLowerCase(c[i]);
						}
						int num = c[i] - 'a';
						counter[num]++;
					}
				}
			}
			
			for(int i = 0; i < counter.length; i++){
				System.out.println( ch++ + " : " + counter[i]);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}