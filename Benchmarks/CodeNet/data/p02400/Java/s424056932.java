import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

            // 入力されたrを定義

            double r = scanner.nextDouble();

            // 与えられた値rで面積と円周を計算
            double menseki = r * r * 3.141592653589;
            double enshuu = 2 * r * 3.141592653589;

            System.out.println(String.format("%.6f", menseki) + " " + String.format("%.6f", enshuu));
           // System.out.println(menseki + " " + enshuu);
	}
}

