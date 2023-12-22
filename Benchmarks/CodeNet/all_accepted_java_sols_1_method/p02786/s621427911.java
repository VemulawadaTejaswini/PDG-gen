		
		import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long count = 0;
		while(h > 1){
			count++;
			h /= 2;
		}
		long ans = 2;
		for(int i = 0; i < count; i++){
			ans *= 2;
		}
		System.out.println(ans - 1);
	}
}
