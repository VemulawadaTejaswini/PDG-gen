import java.util.Scanner;

public class Main{
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] c = input.toCharArray();
		
		for(char c1:c){
			if(c1 >= 'a' && c1 <= 'z'){
				sb.append((char)(c1-32));
			}else if(c1 >= 'A' && c1 <= 'Z'){
				sb.append((char)(c1+32));
			}else{
				sb.append((char)(c1));
			}
		}
		
		//出力
		System.out.println(sb);
	}
	
}
