import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(),k=scan.nextInt();
		if(k>1){
			System.out.println(n-k);
		}else{
			System.out.println(0);
		}
	}
}
