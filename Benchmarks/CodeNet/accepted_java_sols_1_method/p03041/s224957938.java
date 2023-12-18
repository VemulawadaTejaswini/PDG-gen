import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int b = (int) s.charAt(k-1);
        b+=32;
		System.out.println(s.substring(0,k-1)+(char)b+s.substring(k,n));
  }
}