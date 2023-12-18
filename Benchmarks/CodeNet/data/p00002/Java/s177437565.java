import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		digitNumber();
	}
	
	public static void digitNumber(){
		Scanner sc = new Scanner(System.in);
		int a,b,c;

		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b;
			String str = String.valueOf(c);
			System.out.println(str.length());
			
		}

	}

}