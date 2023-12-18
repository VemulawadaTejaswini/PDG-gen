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
			
			Stack<Integer> s = new Stack<Integer>();
			for(char var : c){
				try{
				if(var == '('){
					s.push(1);
				}
				if(var == '['){
					s.push(0);
				}
				if(var == ')' && s.peek() == 1){
					s.pop();
				}
				if(var == ']' && s.peek() == 0){
					s.pop();
				}
				}catch(Exception e){
					System.out.println("no");
					continue x;
				}
			}
			if(s.size() == 0){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
		reader.close();
	}
}