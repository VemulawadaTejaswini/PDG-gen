import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = "x";
		
		for(int i = 0; i < S.length() - 1; i++){
			T += "x";
		}
		
		System.out.println(T);
	}
}
