import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        //各行の数字の和
        int sum = 0;

        for (int i = 0; i < N.length(); i++) {
        	//Nの各行を数値に変換し足す
        	int x = Integer.parseInt(N.substring(i, i+1));
        	sum += x;
        }

        int n = Integer.parseInt(N);
        String judge = n % sum == 0 ? "Yes" : "No";

        System.out.println(judge);
	}
}