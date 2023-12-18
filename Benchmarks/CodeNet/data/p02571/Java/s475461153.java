import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int counter = 0;
		for(int i = 0;i < (S.length() - T.length() + 1);i++){
			int count2 = 0;
			for(int j = 0;j < T.length();j++){
				if(S.charAt(i + j) == T.charAt(j)){
					count2++;
				}
			}
			counter = Math.max(counter,count2);
		}
		System.out.println(T.length() - counter);
	}
}