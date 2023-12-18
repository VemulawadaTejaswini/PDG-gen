import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		int n, current;
		
		n = Integer.valueOf(reader.readLine());
		for(int i = 0; i < n; i++){
			char ch[] = reader.readLine().toCharArray();
			char res[] = new char[52];
			res[current = 26] = ch[0];
			
			for(int j = 3; j < ch.length; j += 3){
				if((ch[j - 2] + "" + ch[j - 1]).equals("<-")){
					--current;
					res[current] = ch[j];
				}else{
					++current;
					res[current] = ch[j];
				}
			}
			for(char var : res){
				if((int)var != 0)
				System.out.print(var);
			}
			System.out.println();
		}
		reader.close();
	}
}