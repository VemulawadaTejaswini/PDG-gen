import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<10&&b<10) {
			System.out.println(a*b);
		}
		else {
			System.out.println(-1);
		}
	}	
}