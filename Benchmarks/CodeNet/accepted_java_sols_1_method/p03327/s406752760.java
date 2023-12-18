import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String result = null;

		if(N < 1000){
			result = "ABC";
		}else{
			result = "ABD";
		}
		System.out.println(result);
		
	}
}