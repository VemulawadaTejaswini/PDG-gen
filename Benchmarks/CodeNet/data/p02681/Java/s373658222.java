
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S=sc.nextLine();
		String T=sc.nextLine();
      	String U=T.substring(0,S.length());
		if(U.equals(S)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
