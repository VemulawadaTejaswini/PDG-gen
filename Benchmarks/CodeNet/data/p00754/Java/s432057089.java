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
			char ch[] = str.toCharArray();
			Stack<Integer> s = new Stack<Integer>();
			for(int i = 0; i < ch.length; i++){
				try{
				if(ch[i] == '(') s.push(1);
				if(ch[i] == ')' && s.peek() == 1) s.pop();
				if(ch[i] == '[') s.push(0);
				if(ch[i] == ']' && s.peek() == 0) s.pop();
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