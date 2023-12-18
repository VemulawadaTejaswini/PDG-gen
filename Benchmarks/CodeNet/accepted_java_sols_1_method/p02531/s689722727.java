import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		ArrayDeque<String> stackList = new ArrayDeque<String>();
		String str;

		while(!(str=br.readLine()).equals("quit")){
			if(str.equals("pop")){
				list.add(stackList.pop());
			}else{
				String strArray[] = str.split(" ");
				stackList.push(strArray[1]);
			}
		}
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}