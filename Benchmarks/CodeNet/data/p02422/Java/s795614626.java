import java.util.Scanner;

public class Main {
	
	private static StringBuilder answer = new StringBuilder();
	
	private static String PRINT   = "print";
	private static String REVERSE = "reverse";
	private static String REPLACE = "replace";

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String target = sc.next();
		int numbers   = Integer.parseInt(sc.next());
		
		for(int i = 0; i<numbers;i++){
			
			String command = sc.next();
						
			target = operate(command,target,sc);
			
		}
		
		System.out.print(answer);
		
		sc.close();
	}

	private static String operate(String command, String target,Scanner sc) {
		
		if(PRINT.equalsIgnoreCase(command)){
			
			int a  = Integer.parseInt(sc.next());
			int b  = Integer.parseInt(sc.next());
			String print = target.substring(a,b+1);
			answer.append(print + "\n");
			
			return target;
		}
		else if(REPLACE.equalsIgnoreCase(command)){
			
			int a  = Integer.parseInt(sc.next());
			int b  = Integer.parseInt(sc.next());
			String strings = sc.next();
			
			char[] charOftarget = target.toCharArray();
			char[] charOfstrings= strings.toCharArray();
			
			for(int i = 0 ;i<target.length();i++){
				
				if( a <= i && i <= b){
					charOftarget[i] = charOfstrings[i-a];
				}
				
			}
			
			
			return String.valueOf(charOftarget);
			
		}else if(REVERSE.equalsIgnoreCase(command)){
			
			int a  = Integer.parseInt(sc.next());
			int b  = Integer.parseInt(sc.next());
			
			char[] charOftarget = target.toCharArray();
			char[] answer  = new char[charOftarget.length];
			for(int i = 0 ;i<target.length();i++){
				
				if(a <= i && i <= b){
					
					answer[i] = charOftarget[b-(i-a)];
					continue;
				}
				
				answer[i] = charOftarget[i];
				
				
				
			}
			
			return String.valueOf(answer);
			
		}
		
		
		return null;
	}

}

