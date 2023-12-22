import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		
		String al =A.substring(A.length()-1,A.length());
		String bl =B.substring(B.length()-1,B.length());
		
		String bs =B.substring(0,1);
		String cs =C.substring(0,1);
		
		
		if(al.equals(bs) && bl.equals(cs)){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		
		
		
	}
}
