import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String s = sc.next();
      	String t = sc.next();
     
       char[] schar = s.toCharArray();
       char[] tchar = t.toCharArray();
      for(int i=0; i<n; i++){
        System.out.print(schar[i]+""+tchar[i]);
      }
	}
}