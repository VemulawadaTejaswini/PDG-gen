import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String str;
		
		char ch[] = new char[]{'(', '[', ')', ']'};
		x : while(!(str = reader.readLine()).equals(".")){
			char c[] = str.toCharArray();
			
			Stack<Integer> s = new Stack<Integer>(); s.push(3);
			for(char var : c){
				for(int i = 0; i < 2; i++){
					if(var == ch[i]){
						s.push(i);
					}else if(var == ch[i + 2] && s.peek() == i){
						s.pop();
					}else if(var == ch[i + 2] && s.peek() != app.set(i)){
						System.out.println("no");
						continue x;
					}
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
		public int set(int i){
			if(i == 1) return 0;
			else return 1;
		}
}