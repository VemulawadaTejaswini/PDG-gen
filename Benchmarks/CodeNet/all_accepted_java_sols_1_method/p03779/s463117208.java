import java.util.Scanner;
 
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int n  = in.nextInt();
		int sum = 0;
		
		int i;
		for(i = 0; sum < n; i++){
			sum += i;
		}
		System.out.println(i - 1);
	}
}