import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long result = 0;
		for(int i=1;i<=n;i++){
			long x = i * i;
			if(x <= n){
				result = x;
			}else{
				break;
			}
		}
		System.out.println(result);
	}

}
