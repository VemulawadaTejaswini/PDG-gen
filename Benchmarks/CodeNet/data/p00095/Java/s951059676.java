import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String>list = new ArrayList<String>();
		String f = br.readLine();
		int max=-1;
		int rank = 0 ;
		for(int i = 1 ; i <= Integer.parseInt(f) ; i++){
			String score = br.readLine();
			list.add(score);
		}
		for (int i = 0 ; i <list.size() ; i++){
			String[] str = list.get(i).split(" ");
			if(max < Integer.parseInt(str[1])){
				max = Integer.parseInt(str[1]);
				rank++;
			}
		}
		System.out.println(rank + " " + max);
	}

}