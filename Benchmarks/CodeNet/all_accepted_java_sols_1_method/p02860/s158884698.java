import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        int center = n / 2;
        String head = s.substring(0, center);
        String result = s.equals((head + head)) ? "Yes":"No";
        
        System.out.println(result);
        sc.close();
	}
}