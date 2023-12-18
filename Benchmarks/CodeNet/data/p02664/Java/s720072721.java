import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < T.length();i++){
			if(T.charAt(i) == '?'){
				sb.append("D");
			}else{
				sb.append(T.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}