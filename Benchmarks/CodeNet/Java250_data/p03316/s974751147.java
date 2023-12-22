import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int work = num;
		int sum=0;
		
		while(work != 0){
			sum +=  (work % 10);
			work /= 10;
		}
		if(num % sum == 0) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}
