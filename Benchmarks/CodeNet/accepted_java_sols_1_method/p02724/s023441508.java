import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n500 = num/500;
		int n005 = 0;
		if(n500 > 0) {
			n005 = (num%500)/5;
		}else {
			n005 = num/5;
		}
		
		System.out.println(n500*1000 + n005*5);
	}
}