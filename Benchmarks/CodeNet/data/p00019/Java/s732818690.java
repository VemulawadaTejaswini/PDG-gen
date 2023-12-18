import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 1;
		for(int i=1; i <= n ;i++){
			sum *= i;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}