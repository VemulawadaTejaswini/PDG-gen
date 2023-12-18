import java.util.Scanner;


public class Main {

    public static int ctoi(char c) {
        switch (c) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int sum = 0;
            String str = new String();
            str = input.next();
            char d = str.charAt(0);
            int c = ctoi(d);
            if (c == 0) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                int b = ctoi(a);
                sum += b;
            }
            System.out.println(sum);
        }

    }
}
