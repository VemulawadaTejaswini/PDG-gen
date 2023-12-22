import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String b = sc.nextLine();
		int count = 0;
		sc.close();
		for(int i = 0;i < 3;i++){
			if(a.charAt(i)==b.charAt(i)){
				count++;
			}
		}
System.out.println(count);
	}
}
