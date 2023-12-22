import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int count = 0;
		sc.close();
		
		for(int a = 0; a<K-1; a++){
			for(int b = a+1; b<K; b=b+2){
				count++;
			}
		}
		System.out.println(count);
	}
}
