import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));

		String[] str = null;
		try{
			str = reader.readLine().split(" ",0);

		for(int i = 0; i < str.length; i++){
			if(str[i].matches("apple")){
				str[i] = str[i].replaceAll("apple", "peach");
				continue;
			}
			if(str[i].equals("peach")){
				str[i] = str[i].replaceAll("peach", "apple");
				continue;
			}
			if(str[i].matches("apple.")){
				str[i] = str[i].replaceAll("apple.", "peach.");
				continue;
			}
			if(str[i].equals("peach.")){
				str[i] = str[i].replaceAll("peach.", "apple.");
				continue;
			}
		}
		for(int i = 0; i < str.length; i++)
			if(i != str.length - 1)
				System.out.print(str[i] + " ");
			else
				System.out.println(str[i]);
		
		reader.close();
		}catch(IOException e){
		}
	}
}