import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int N = s.length();
        String ans = "Yes";
        StringBuilder sb1 = new StringBuilder(s);
        if(!(s.equals(sb1.reverse().toString()))){
          ans = "No";
        }
      
        String str1 = s.substring(0,(N-1)/2);
        StringBuilder sb2 = new StringBuilder(str1);
        if(!(str1.equals(sb2.reverse().toString()))){
          ans = "No";
        }
      
        String str2 = s.substring((N+3)/2-1,N);
        StringBuilder sb3 = new StringBuilder(str2);
        if(!(str2.equals(sb3.reverse().toString()))){
          ans = "No";
        }
      
      System.out.println(ans);
      
	}

}