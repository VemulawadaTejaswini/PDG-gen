import java.util.*;
public class Main {
	
	public static void main(String[] args){
		
		Integer[] calledPon = {0,1,6,8};
		
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int num = sc.nextInt()%10;

		if(num == 3) {
			System.out.println("bon");
		} else if (Arrays.asList(calledPon).contains(num)) {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}
		
	}
}