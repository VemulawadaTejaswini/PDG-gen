import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String sb1 = s.substring(0, 2);
		String sb2 = s.substring(2);
		
		int first = Integer.parseInt(sb1);
		int second = Integer.parseInt(sb2);
		
		String ans = "NA";
		if(first > 0 && first <= 12 && second > 0 && second <= 12) ans = "AMBIGUOUS";
		else if(first > 0 && first <= 12) ans = "MMYY";
		else if(second > 0 && second <= 12) ans = "YYMM";
		
		System.out.println(ans);
	}
}