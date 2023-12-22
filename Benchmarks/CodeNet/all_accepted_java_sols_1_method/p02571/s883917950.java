import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	String t = sc.next();
      	String ss;
      	int lim = s.length()-t.length()+1;
      	int cnt=0;
      	int cnt_min = t.length();
      
      	for(int i = 0;i < lim;i++){
          ss = s.substring(i,i+t.length());
          cnt = 0;
          for(int j = 0; j < t.length();j++){
            if(ss.charAt(j) != t.charAt(j)) cnt++;
          }
          if(cnt_min > cnt) cnt_min = cnt;
        }
      
      	System.out.println(cnt_min);
	}
}
