import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String[] c = str.split("");
		int left = 0;
		int right = n-1;
		int count = 0;
		while(true){
			if("R".equals(c[left])){
				left++;
			} else if("W".equals(c[right])){
				right--;
			} else if("W".equals(c[left]) && "R".equals(c[right]) && left < right) {
				count++;
				left++;
				right--;
			} else {
				break;
			}
			if(left > right || right >= n)break;
		}
		System.out.println(count);
	}
}