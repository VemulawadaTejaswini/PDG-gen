import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        String result = "";
        System.out.println(calc(result, N, 1));
        sc.close();

    }

    static String calc(String result, long N, int count) {
        if (N < 26) {
            return moji((int) N) + result;
        } else if (N == 26) {
            return moji(0) + result;
        }

        result = (moji((int) (N % 26))) + result;
        if (N % 26 != 0) {
            return calc(result, ((N - N % 26) / 26), count++);
        } else {
            return calc(result, ((N - 26) / 26), count++);
        }
    }

    static String moji(int N) {
        String moji = "";
        switch (N) {
            case 1:
                moji = "a";
                break;
            case 2:
                moji = "b";
                break;
            case 3:
                moji = "c";
                break;
            case 4:
                moji = "d";
                break;
            case 5:
                moji = "e";
                break;
            case 6:
                moji = "f";
                break;
            case 7:
                moji = "g";
                break;
            case 8:
                moji = "h";
                break;
            case 9:
                moji = "i";
                break;
            case 10:
                moji = "j";
                break;
            case 11:
                moji = "k";
                break;
            case 12:
                moji = "l";
                break;
            case 13:
                moji = "m";
                break;
            case 14:
                moji = "n";
                break;
            case 15:
                moji = "o";
                break;
            case 16:
                moji = "p";
                break;
            case 17:
                moji = "q";
                break;
            case 18:
                moji = "r";
                break;
            case 19:
                moji = "s";
                break;
            case 20:
                moji = "t";
                break;
            case 21:
                moji = "u";
                break;
            case 22:
                moji = "v";
                break;
            case 23:
                moji = "w";
                break;
            case 24:
                moji = "x";
                break;
            case 25:
                moji = "y";
                break;
            case 0:
                moji = "z";
                break;
        }
        return moji;
    }
}
