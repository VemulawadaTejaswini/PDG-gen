import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next(); //計算回数

		if(S.charAt(S.length()-1)=='s'){
			System.out.println(S.substring(0, S.length())+"es");
		}else{
			System.out.println(S.substring(0, S.length())+"s");
		}
	}
}
