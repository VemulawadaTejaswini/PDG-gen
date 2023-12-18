import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] c = line.toCharArray();
        int l = c.length;

        for(int i = 0; i < l; i++) {
          switch(c[i]) {
            case 'a':
              c[i] = 'A';
              break;
            case 'b':
              c[i] = 'B';
              break;
            case 'c':
              c[i] = 'C';
              break;
            case 'd':
              c[i] = 'D';
              break;
            case 'e':
              c[i] = 'E';
              break;
            case 'f':
              c[i] = 'F';
              break;
            case 'g':
              c[i] = 'G';
              break;
            case 'h':
              c[i] = 'H';
              break;
            case 'i':
              c[i] = 'I';
              break;
            case 'j':
              c[i] = 'J';
              break;
            case 'k':
              c[i] = 'K';
              break;
            case 'l':
              c[i] = 'L';
              break;
            case 'm':
              c[i] = 'M';
              break;
            case 'n':
              c[i] = 'N';
              break;
            case 'o':
              c[i] = 'O';
              break;
            case 'p':
              c[i] = 'P';
              break;
            case 'q':
              c[i] = 'Q';
              break;
            case 'r':
              c[i] = 'R';
              break;
            case 's':
              c[i] = 'S';
              break;
            case 't':
              c[i] = 'T';
              break;
            case 'u':
              c[i] = 'U';
              break;
            case 'v':
              c[i] = 'v';
              break;
            case 'w':
              c[i] = 'W';
              break;
            case 'x':
              c[i] = 'X';
              break;
            case 'y':
              c[i] = 'Y';
              break;
            case 'z':
              c[i] = 'Z';
              break;
            case 'A':
              c[i] = 'a';
              break;
            case 'B':
              c[i] = 'b';
              break;
            case 'C':
              c[i] = 'c';
              break;
            case 'D':
              c[i] = 'd';
              break;
            case 'E':
              c[i] = 'e';
              break;
            case 'F':
              c[i] = 'f';
              break;
            case 'G':
              c[i] = 'g';
              break;
            case 'H':
              c[i] = 'h';
              break;
            case 'I':
              c[i] = 'i';
              break;
            case 'J':
              c[i] = 'j';
              break;
            case 'K':
              c[i] = 'k';
              break;
            case 'L':
              c[i] = 'l';
              break;
            case 'M':
              c[i] = 'm';
              break;
            case 'N':
              c[i] = 'n';
              break;
            case 'O':
              c[i] = 'o';
              break;
            case 'P':
              c[i] = 'p';
              break;
            case 'Q':
              c[i] = 'q';
              break;
            case 'R':
              c[i] = 'r';
              break;
            case 'S':
              c[i] = 's';
              break;
            case 'T':
              c[i] = 't';
              break;
            case 'U':
              c[i] = 'u';
              break;
            case 'V':
              c[i] = 'v';
              break;
            case 'W':
              c[i] = 'w';
              break;
            case 'X':
              c[i] = 'x';
              break;
            case 'Y':
              c[i] = 'y';
              break;
            case 'Z':
              c[i] = 'z';
              break;
          }
        }
        System.out.println(String.valueOf(c));
    }
}