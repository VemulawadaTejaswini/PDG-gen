import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		
		String a = A.substring(A.length()-1,A.length());
		String b = B.substring(B.length()-1,B.length());

		if(a.equals(B.substring(0,1)) && b.equals(C.substring(0,1))){ 
				System.out.println("YES");
			} else{
				System.out.println("NO");
			}
	}
}