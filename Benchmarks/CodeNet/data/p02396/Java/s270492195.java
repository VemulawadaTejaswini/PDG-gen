import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,x;
		Scanner sc = new Scanner(System.in);
		for(i=1;(x=sc.nextInt()) != 0;i++){
			System.out.println("case "+i+" : "+x);
		}
		sc.close();
	}

}
