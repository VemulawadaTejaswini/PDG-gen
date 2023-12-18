import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InpputStreamReader(Systemin));
		String word;
		try{
			word = reader.readLine();
			int num = Integer.parseInt(word);
			int ans = num * num * num;
			System.out.println(ans);
		}catch(IOException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}