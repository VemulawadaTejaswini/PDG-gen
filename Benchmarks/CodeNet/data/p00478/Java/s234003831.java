import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int n = sc.nextInt();
		int sum = 0;

		while(n-- > 0){
			String ss = sc.next();
			int m = ss.length();

			while(m-- > 0){
				if(ss.contains(s)){
					sum++;
					break;
				}
				ss = ss.substring(1) + ss.charAt(0);
			}
		}
		System.out.println(sum);
	}
}