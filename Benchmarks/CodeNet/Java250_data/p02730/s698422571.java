import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 int n = s.length();
		 String s1 = s.substring(0, (n-1)/2);
		 String s2 = s.substring((n+1)/2, n);
        if(isKai(s) && isKai(s1) && isKai(s2)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
    }
	
	public static boolean isKai(String s){
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}




