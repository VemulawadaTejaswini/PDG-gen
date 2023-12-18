import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String s = sc.next();
        int n2 = sc.nextInt();
        if(s.equals("+")){
        	System.out.println(n1 + n2);
        }else{
        	System.out.println(n1 - n2);
        }
	}
}