import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 0;

		for(int i=0; i<S.length(); i++){
			String str = String.valueOf(S.charAt(i));
			if(str.equals("0")){
				count++;
			}
		}

		System.out.println(Math.min(count, S.length()-count)*2);
    }
}
