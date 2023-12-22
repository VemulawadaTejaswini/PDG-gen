import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int idade;
		Scanner scanner = new Scanner(System.in);
		idade = scanner.nextInt();
		if(idade == 7) {
			System.out.println("YES\n");
		} else if (idade == 5){
			System.out.println("YES\n");
		} else if (idade == 3) {
			System.out.println("YES\n");
		}else
			System.out.println("NO\n");
	}

}
