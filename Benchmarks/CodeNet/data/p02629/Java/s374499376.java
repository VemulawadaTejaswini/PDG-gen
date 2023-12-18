import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(calc(N));
        sc.close();
        return;
    }

    static String calc(long N) {
        if (N == 0) {
            return "";
        }
        N--;
        return calc(N / 26) + _char((int) (N % 26));
    }

    static String _char(int N) {
        String moji = "";
        switch (N) {
            case 0:
                moji = "a";
                break;
            case 1:
                moji = "b";
                break;
            case 2:
                moji = "c";
                break;
            case 3:
                moji = "d";
                break;
            case 4:
                moji = "e";
                break;
            case 5:
                moji = "f";
                break;
            case 6:
                moji = "g";
                break;
            case 7:
                moji = "h";
                break;
            case 8:
                moji = "i";
                break;
            case 9:
                moji = "j";
                break;
            case 10:
                moji = "k";
                break;
            case 11:
                moji = "l";
                break;
            case 12:
                moji = "m";
                break;
            case 13:
                moji = "n";
                break;
            case 14:
                moji = "o";
                break;
            case 15:
                moji = "p";
                break;
            case 16:
                moji = "q";
                break;
            case 17:
                moji = "r";
                break;
            case 18:
                moji = "s";
                break;
            case 19:
                moji = "t";
                break;
            case 20:
                moji = "u";
                break;
            case 21:
                moji = "v";
                break;
            case 22:
                moji = "w";
                break;
            case 23:
                moji = "x";
                break;
            case 24:
                moji = "y";
                break;
            case 25:
                moji = "z";
                break;
        }
        return moji;
    }
}
