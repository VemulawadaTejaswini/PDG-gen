import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String str;
		
		x : while(!(str = reader.readLine()).equals(".")){
			char c[] = str.toCharArray();
			
			Stack<Integer> s = new Stack<Integer>(); s.push(3);
			for(char var : c){
				if(var == '('){
					s.push(1);
				}
				else if(var == '['){
					s.push(0);
				}
				else if(var == ')' && s.peek() == 1){
					s.pop();
				}
				else if(var == ']' && s.peek() == 0){
					s.pop();
				}
				else if(var == ')' && s.peek() != 1){
					System.out.println("no");
					continue x;
				}
				else if(var == ']' && s.peek() != 0){
					System.out.println("no");
					continue x;
				}
			}
			if(s.size() == 1){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
		reader.close();
	}
}