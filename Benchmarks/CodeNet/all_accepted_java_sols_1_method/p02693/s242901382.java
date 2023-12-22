import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean able = false;
		for(int i = a; i <= b; i++) {
			if(i%k==0) {
				able = true;
				break;
			}
		}
		System.out.println(able? "OK":"NG");
	 }
}