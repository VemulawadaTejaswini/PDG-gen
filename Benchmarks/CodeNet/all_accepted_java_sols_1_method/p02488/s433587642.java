import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{
			String s = br.readLine();
			int n = Integer.parseInt(s);
			ArrayList<String> list = new ArrayList<String>();
			for(int i=0; i<n; i++){
				String word = br.readLine();
				list.add(word);
			}

			Collections.sort(list);

			System.out.println(list.get(0));

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}