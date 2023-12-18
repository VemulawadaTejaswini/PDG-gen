import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long res = 1L;
		try{for(int i = 0; i < n; i++){
			res *= sc.nextLong();
		}
		System.out.println(res);
		}catch(Exception e){
			System.out.println(-1);
		}

	}
}