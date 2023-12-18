import java.util.Scanner;

public class Main {
    static final char NULL = '\0';

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            char[] input = sc.next().toCharArray();
            StringBuilder out = new StringBuilder();
            char buf = NULL;
            for (int i = 0; i < input.length; i++) {
                switch (input[i]) {
                case '1':
                    if (buf != NULL && buf != ' ') {
                        switch (buf) {
                        case '.':
                            buf = ',';
                            break;
                        case ',':
                            buf = '!';
                            break;
                        case '!':
                            buf = '?';
                            break;
                        case '?':
                            buf = ' ';
                            break;
                        }
                    } else
                        buf = '.';
                    break;
                case '2':
                    if (buf != NULL && buf != 'c') {
                        buf += 1;
                    } else
                        buf = 'a';
                    break;
                case '3':
                    if (buf != NULL && buf != 'f') {
                        buf += 1;
                    } else
                        buf = 'd';
                    break;
                case '4':
                    if (buf != NULL && buf != 'i') {
                        buf += 1;
                    } else
                        buf = 'g';
                    break;
                case '5':
                    if (buf != NULL && buf != 'l') {
                        buf += 1;
                    } else
                        buf = 'j';
                    break;
                case '6':
                    if (buf != NULL && buf != 'o') {
                        buf += 1;
                    } else
                        buf = 'm';
                    break;
                case '7':
                    if (buf != NULL && buf != 's') {
                        buf += 1;
                    } else
                        buf = 'p';
                    break;
                case '8':
                    if (buf != NULL && buf != 'v') {
                        buf += 1;
                    } else
                        buf = 't';
                    break;
                case '9':
                    if (buf != NULL && buf != 'z') {
                        buf += 1;
                    } else
                        buf = 'w';
                    break;
                case '0':
                    if (buf != NULL) {
                        out.append(buf);
                        buf = NULL;
                    }
                    break;
                }
            }
            System.out.println(out.toString());
            n--;
        }
    }
}