import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 入力情報（個数）
        int N = scan.nextInt();

        int ansAC = 0;
        int ansWA = 0;
        int ansTLE = 0;
        int ansRE = 0;

        List<String> results = new ArrayList<String>();

        // 入力情報（内容）
        for(int i = 0; i < N; i++){
            String input = scan.next();
            results.add(input);
        }

        // カウント
        ansAC = Collections.frequency(results, "AC");
        ansWA = Collections.frequency(results, "WA");
        ansTLE = Collections.frequency(results, "TLE");
        ansRE = Collections.frequency(results, "RE");

        // 結果出力
        System.out.println("AC x "+ ansAC);
        System.out.println("WA x "+ ansWA);
        System.out.println("TLE x "+ ansTLE);
        System.out.println("RE x "+ ansRE);
        scan.close();

    }
}