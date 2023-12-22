import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal n = sc.nextBigDecimal();
		BigDecimal m = sc.nextBigDecimal();
		
		System.out.println(n.multiply(m).setScale(0, BigDecimal.ROUND_DOWN));
	}

}

