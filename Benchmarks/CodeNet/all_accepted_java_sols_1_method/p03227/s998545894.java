import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String answer;
		switch(S.length()){
			case 2:
			answer = S;
			break;
			case 3:
			StringBuffer sb = new StringBuffer(S);
			answer = sb.reverse().toString();
			break;
			default:
			answer = "";
		}
		System.out.println(answer);
		System.out.flush();
		return;
	}
}
