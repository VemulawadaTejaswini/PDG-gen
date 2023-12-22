import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[] ac = new int[n];
	    int[] wa = new int[n];
	    
	    for (int i = 0; i < m; i++) {
			int temp = sc.nextInt() - 1;
			String s = sc.next();
			// まだACが出ていないなら
			if (ac[temp] == 0) {
				if (s.equals("AC")) {
					ac[temp]++;
				} else {
					wa[temp]++;
				}
			}
		}
	    
	    int ans1 = 0;
	    int ans2 = 0;
	    for (int i = 0; i < n; i++) {
	    	// ACが出ている問題のみカウント
			if (ac[i] == 1) {
				ans1 += ac[i];
				ans2 += wa[i];
			}
		}
	    
	    System.out.println(ans1 + " " + ans2);
	  
	  }
	}