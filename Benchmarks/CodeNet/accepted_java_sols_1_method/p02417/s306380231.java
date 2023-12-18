import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] counter = new int[127];
        while (sc.hasNext()) {
            String str = sc.nextLine().toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                counter[str.charAt(i)]++;
            }
        }
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + " : " + counter[i]);
        }
    }
}
//答え(sc.nextline.toLowerCase();のような関数が連続するところの理解はできるが実装する発想が難しい。。。
