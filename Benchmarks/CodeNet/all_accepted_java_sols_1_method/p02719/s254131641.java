import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		
        long b = sc.nextLong();
        
		long c = Math.min(a%b,-1*(a%b-b));
		System.out.println(c);
	}
}
