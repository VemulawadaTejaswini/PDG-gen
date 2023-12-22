import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = a + b;
			int d = 0;
			
			while(x != 0){
				x /= 10;
				d++;
			}
			
			System.out.println(d);
		}
		
		sc.close();
	}

}