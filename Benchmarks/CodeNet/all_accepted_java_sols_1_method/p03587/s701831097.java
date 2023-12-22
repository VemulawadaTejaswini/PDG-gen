import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int a = 0;
		for (int i = 0; i < 6; i++){
			if(S.charAt(i)=='1')a++;
		}
		System.out.println(a);
	}
}