import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		for(int i=n; i < 600; i+= n){
			sum += (long)n * i * i;
		}
		System.out.println(sum);

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}