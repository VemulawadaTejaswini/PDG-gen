import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		//Stack s = new Stack();
		Stack<Integer> s = new Stack<Integer>();
		
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