import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			String S = sc.next();
			for(int i = S.length() - 2; i >= 0; i-=2){
				if(S.substring(0, i/2).equals(S.substring(i/2, i))){
					System.out.println(i);
					break;
				}
			}
		}
	}
}