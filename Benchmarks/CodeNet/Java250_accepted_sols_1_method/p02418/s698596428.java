import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	String s = sc.nextLine();
    	String s2 = s + s;
    	String p = sc.nextLine();
    	
    	if(s2.contains(p)) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
    	}
    }
}
