import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		long sum = 0;
		while(s.length() > 0){
			sum += Integer.parseInt(s.substring(0, 1));
			s = s.substring(1);
		}
		
		System.out.println(sum % 9 == 0 ? "Yes" : "No");
	}
}
