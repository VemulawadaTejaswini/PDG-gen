import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	int n = sc.nextInt();
	   	String[] s = new String[n];
	   	int sum = 1;
	   	for(int i = 0; i < n; i++){
	   		s[i] = sc.next();
	   	}
	   	Arrays.sort(s);
	   	for(int i = 1; i < n; i++) {
	   		if(!s[i].equals(s[i-1])) {
	   			sum++;
	   		} 
	   	}
	   	System.out.println(sum);
	}
}