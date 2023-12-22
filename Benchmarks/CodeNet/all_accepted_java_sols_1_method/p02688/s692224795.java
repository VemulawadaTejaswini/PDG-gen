import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] own = new boolean[n];
		for(int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for(int j = 0; j < d; j++) {
				int a = sc.nextInt();
				if(own[a-1]==false) {
					own[a-1]=true;
				}
			}
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(own[i]==false) {
				count++;
			}
		}
		System.out.println(count);
	 }
}