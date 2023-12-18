import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int num = sc.nextInt();
			int sum = 0;
			
			for(int i = 0; i < 600; i = i + num){
				sum = sum + (num * i * i);
			}
			System.out.println(sum);
		}
	}
}