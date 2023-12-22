import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = "No";

		while(N > 0){
			if(N % 10 == 7){
			s = "Yes";
			break;
			}
			N = N / 10;
			
		}
		System.out.println(s);
		
	}
}