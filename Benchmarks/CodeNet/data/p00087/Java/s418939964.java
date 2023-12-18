import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.regex.Pattern;


public class Main {

	Boolean isNumber(String s){
		return Pattern.matches("\\A[0-9]+.?[0-9]*\\z",s);
	}
	
	double solve(String str){
		Deque<Double> stack=new LinkedList<Double>();
		StringTokenizer st=new StringTokenizer(str);
		
		while(st.hasMoreTokens()){
			String token=st.nextToken();
			if(isNumber(token)){
				stack.push(Double.parseDouble(token));
			}
			else{
				double a=stack.pop();
				double b=stack.pop();
				double c=0;
				switch(token.charAt(0)){
				case '+':
					c=b+a;
					break;
				case '-':
					c=b-a;
					break;
				case '*':
					c=b*a;
					break;
				case '/':
					c=b/a;
					break;
				}
				stack.push(c);
			}
		}
		return stack.pop();
	}
	
	void io(){
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			while((str=input.readLine())!=null){
				System.out.println(solve(str));
			}
			
		} catch (IOException e) {
		}
	}
	
	public static void main(String[] args){
		new Main().io();
	}
}