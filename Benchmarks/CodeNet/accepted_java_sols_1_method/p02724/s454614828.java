import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = (n/500)*1000;
		n %= 500;
		result += (n/5)*5;
		System.out.println(result);
	}
}