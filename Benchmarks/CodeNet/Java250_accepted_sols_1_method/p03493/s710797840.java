import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
		int cnt = 0;
      	for(char c : str.toCharArray())
          if(c == '1') cnt++;
      	System.out.println(cnt);
        
    }
}