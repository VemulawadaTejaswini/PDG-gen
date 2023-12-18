import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str = br.readLine();
			if(str.equals(".")){
				break;
			}
			boolean f = true;
			Stack<Integer> stack = new Stack<Integer>();
			char[] s = str.toCharArray();
			for(int i= 0;i<s.length;i++){
				
				if(s[i]=='('){
					stack.push(1);
				}
				else if(s[i]=='['){
					stack.push(2);
				}
				else if(s[i]==')'){
					if(stack.size()==0){
						f=false;
						break;
					}
					
					int a = stack.pop();
					
					if(a!=1){
						f=false;
						break;
					}
				}
				else if(s[i]==']'){
					if(stack.size()==0){
						f=false;
						break;
					}
					int a = stack.pop();
					if(a!=2){
						f=false;
						break;
					}
				}
			}
			if(f){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}

	}

}