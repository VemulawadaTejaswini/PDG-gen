import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long ans = 1;
			for(int i = 1; i < 41; i++) {
				long right = 1;
				long left = 1;
				for(int j = 0; j < i-1; j++) {
					left*=2;
				}
				for(int j = 0; j < i; j++) {
					right*=2;
				}
				if(left<=H&&H<right) {
					ans = right-1;
					break;
				}
			}
		System.out.println(ans);
	 }
}