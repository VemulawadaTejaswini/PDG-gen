import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (true ){
		String str = br.readLine();
		int a = Integer.parseInt(str);
		if (a == 0 ) break;
		list.add(a);
		}
		
		for (int i = 0 ; i < list.size() ; i++){
			System.out.println("Case " + i + ": " + list.get(i));
		}

	}

}