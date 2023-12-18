import java.util.Scanner;

//atcoderはScannerクラスのsc.next()で行ける
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.substring(str.length() - 1).toLowerCase().equals("s")) {
            System.out.println(str + "es");
        } else {
            System.out.println(str + "s");
        }
    }
}