import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        int cnt = 0;
      
        for (int i=0; i<sb.length()-1; i++) {
          if (sb.charAt(i) != sb.charAt(sb.length()-1-i)) {
             sb.replace(i, i+1, String.valueOf(sb.charAt(sb.length()-1-i)));
             cnt++;
          }
        }
      System.out.println(cnt);
      
	}
}