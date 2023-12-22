import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ans = 1;
      
      	while(sc.hasNextInt()){
			 ans *= sc.nextInt();
        }
		sc.close();

		System.out.println(ans);
	}
}