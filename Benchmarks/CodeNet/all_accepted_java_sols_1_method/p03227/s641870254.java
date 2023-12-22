import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String S = sc.next();

		if(S.length()==2){
			System.out.println(S);
		}else {
			String[] str = S.split("");
			String ans = str[2]+str[1]+str[0];
			System.out.println(ans);
		}
	}
}
