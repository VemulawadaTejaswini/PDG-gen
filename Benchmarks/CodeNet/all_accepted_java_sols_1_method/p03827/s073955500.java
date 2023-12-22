import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	char[] s = sc.next().toCharArray();
      	int ans = 0;
      	int cnt = 0;
      
		for (int i = 0; i < n; i++) {
        	if (s[i] == 'D') {
              cnt--;
            } else {
              cnt++;
            }
          
          if (cnt > ans) ans = cnt;
            
        }
      
      System.out.println(ans);
    }
}