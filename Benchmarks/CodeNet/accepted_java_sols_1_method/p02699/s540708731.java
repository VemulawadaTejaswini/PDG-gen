import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	int s = sc.nextInt();
	   	int w = sc.nextInt();
	   	if(s<=w) {
	   		System.out.println("unsafe");
	   	}
	   	else {
	   		System.out.println("safe");
	   	}
	 }
}