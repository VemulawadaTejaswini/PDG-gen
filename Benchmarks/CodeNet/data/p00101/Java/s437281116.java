import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> ans = new ArrayList<String>();
		String line = in.readLine();

		int data_size = Integer.parseInt(line);

		for(int i=0; i<data_size; i++){
			line = in.readLine();
			String[] words = line.split(" ");

			for(int m=0; m<words.length; m++){
				if(words[m].equals("Hoshino")){
					words[m] = "Hoshina";
				}
				else if(words[m].equals("Hoshino.")){
					words[m] = "Hoshina.";
				}
			}
			ans.add(join(words));
		}

		for(int i=0; i<ans.size(); i++){
			System.out.println(ans.get(i));
		}
	}

	public String join(String[] words){
		String ans = "";
		for(int i=0; i<words.length; i++){
			ans += words[i];

			if(i != words.length-1){
				ans += " ";
			}
		}

		return ans;
	}
}