import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String source, res;
		
		int n = Integer.valueOf(reader.readLine());
		for(int i = 0; i < n; i++){
			source = reader.readLine();
			fffff : for(int a = 0; a < 26; a++){
				for(int b = 0; b < 26; b++){
					char ch[] = source.toCharArray();
					res = "";
					for(int f = 0; f < source.length(); f++){
						if(ch[f] == ' ' || ch[f] == '.'){
							res += " ";
							continue;
						}
						res += (char)app.F(a, b, ch[f]);
					}
					if(res.contains("this") || res.contains("that")){
						System.out.println(res);
						break fffff;
					}
				}
			}
		}
		reader.readLine();
	}
	
	public int F(int a, int b, int y){
		return (a * (y - 97) + b) % 26 + 97;
	}
}