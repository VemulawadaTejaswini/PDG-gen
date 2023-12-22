import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String s = sc.next();
	String t = sc.next();

	String S = s+s;

	if(S.contains(t) == true){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
    }
}
