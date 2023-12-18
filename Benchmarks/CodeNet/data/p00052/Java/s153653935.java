import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		for(n = sc.nextInt();n != 0;n = sc.nextInt()){
			int num = 0;
			for(int i = 5;i <= n;i = i*5){
				num = num + n / i;
			}
			System.out.println(num);
		}
	}

}