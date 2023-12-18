import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		Stack s = new Stack();
		while(true){
			str = br.readLine();
			int n = Integer.parseInt(str);
			
			if(n != 0){
				s.push(n);
			}
			else
				System.out.println(s.pop());
				if(s.empty()){
					break;
				}
		}
	}
}