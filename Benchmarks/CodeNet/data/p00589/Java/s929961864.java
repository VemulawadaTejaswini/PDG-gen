import java.util.Scanner;

public class Main {
    static final char NULL = '\0';

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] input = sc.next().toCharArray();
            StringBuilder out = new StringBuilder();
            char buf = NULL;
            for (int i = 0; i < input.length; i++) {
                if (i != 0 && input[i] != input[i - 1]) {
                    if(buf!='0')
                    out.append(buf);
                    buf = NULL;
                }
                switch (input[i]) {
                case '1':
                    if (buf != NULL) {
                        switch (buf) {
                        case ',':
                            buf = '.';
                            break;
                        case '.':
                            buf = '!';
                            break;
                        case '!':
                            buf = '?';
                            break;
                        case '?':
                            buf = '\'';
                            break;
                        case '\'':
                            buf = ',';
                            break;
                        }
                    } else
                        buf = '\'';
                    break;
                case '2':
                    if (buf != NULL && buf != 'c' && buf != 'C') {
                        buf += 1;
                    } else if (buf == 'c') {
                        buf = 'A';
                    } else
                        buf = 'a';
                    break;
                case '3':
                    if (buf != NULL && buf != 'f' && buf != 'F') {
                        buf += 1;
                    } else if (buf == 'f') {
                        buf = 'D';
                    } else
                        buf = 'd';
                    break;
                case '4':
                    if (buf != NULL && buf != 'i' && buf != 'I') {
                        buf += 1;
                    } else if (buf == 'i') {
                        buf = 'G';
                    } else
                        buf = 'g';
                    break;
                case '5':
                    if (buf != NULL && buf != 'l' && buf != 'L') {
                        buf += 1;
                    } else if (buf == 'l') {
                        buf = 'J';
                    } else
                        buf = 'j';
                    break;
                case '6':
                    if (buf != NULL && buf != 'o' && buf != 'O') {
                        buf += 1;
                    } else if (buf == 'o') {
                        buf = 'M';
                    } else
                        buf = 'm';
                    break;
                case '7':
                    if (buf != NULL && buf != 's' && buf != 'S') {
                        buf += 1;
                    } else if (buf == 's') {
                        buf = 'P';
                    } else
                        buf = 'p';
                    break;
                case '8':
                    if (buf != NULL && buf != 'v' && buf != 'V') {
                        buf += 1;
                    } else if (buf == 'v') {
                        buf = 'T';
                    } else
                        buf = 't';
                    break;
                case '9':
                    if (buf != NULL && buf != 'z' && buf != 'Z') {
                        buf += 1;
                    } else if (buf == 'z') {
                        buf = 'W';
                    } else
                        buf = 'w';
                    break;
                case '0':
                    if (buf == '0') {
                        out.append(' ');
                    } else if (buf == NULL) {
                        buf = '0';
                    }
                    break;
                }
                if (i == input.length - 1)
                    out.append(buf);
            }
            System.out.println(out.toString());
        }
    }
}