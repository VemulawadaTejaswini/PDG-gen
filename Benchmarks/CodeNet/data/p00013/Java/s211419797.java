import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n;
		
		while(true){
			n = Integer.parseInt(reader.readLine());
			if(n != 0){
				list.add(n);
			}
			else{
				System.out.println(list.get(list.size() - 1));
				list.remove(list.size() - 1);
			}
		}
	}
}