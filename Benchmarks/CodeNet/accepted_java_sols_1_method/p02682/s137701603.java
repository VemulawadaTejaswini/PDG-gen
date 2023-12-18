import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		Integer k = sc.nextInt();
		
		Integer result = 0;
		if(k <= a) {
			result = k;
		} 
		else if(k <= a+b) {
			result = a;
		}
		else{
			result = a - (k - a - b);
		}
		System.out.println(result);
	}
}