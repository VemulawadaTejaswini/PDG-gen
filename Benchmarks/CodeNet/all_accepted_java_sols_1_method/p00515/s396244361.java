import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] data = new int[5];
		int x = 0;
		for(int i = 0; i < 5; i++) {
			data[i]= sc.nextInt();
			if(data[i] < 40)data[i] = 40;
		}
		for(int i = 0; i < 5; i++) {
			x = x + data[i];
			
		}
		
		System.out.println(x / 5);

	}

}