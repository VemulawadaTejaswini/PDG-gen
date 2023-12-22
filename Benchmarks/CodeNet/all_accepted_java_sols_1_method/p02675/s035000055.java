import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int len = str.length();
		
		if(str.charAt(len-1)=='3'){
			System.out.println("bon");
			return;
		}
		if(str.charAt(len-1)=='0'){
			System.out.println("pon");
			return;
		}
		if(str.charAt(len-1)=='1'){
			System.out.println("pon");
			return;
		}
		if(str.charAt(len-1)=='6'){
			System.out.println("pon");
			return;
		}
		if(str.charAt(len-1)=='8'){
			System.out.println("pon");
			return;
		}
		
		System.out.println("hon");
		return;

	}
}