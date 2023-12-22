import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		if(n == 1){
			System.out.println(1);
			
		}else {
			int num = 2;
			while(num <= n) {
				num *= 2;
			}
			
			System.out.println(num/2);
		}
		sc.close();
	}
}