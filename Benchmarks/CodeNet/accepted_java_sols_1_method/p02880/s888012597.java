import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean able = false;
		for(int i = 1; i <= 9; i++) {
			if(n/i==(double)n/i&&n/i<10) {
				able = true;
				break;
			}
		}
		System.out.println(able?"Yes":"No");
	}	
}