import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong();
        final String base26 = Long.toString(N, 26);
        StringBuilder sb = new StringBuilder();
        for(char c : base26.toCharArray()) {
            if(c == 'p') c = 'y';
            if(c == 'o') c = 'x';
            if(c == 'n') c = 'w';
            if(c == 'm') c = 'v';
            if(c == 'l') c = 'u';
            if(c == 'k') c = 't';
            if(c == 'j') c = 's';
            if(c == 'i') c = 'r';
            if(c == 'h') c = 'q';
            if(c == 'g') c = 'p';
            if(c == 'f') c = 'o';
            if(c == 'e') c = 'n';
            if(c == 'd') c = 'm';
            if(c == 'c') c = 'l';
            if(c == 'b') c = 'k';
            if(c == 'a') c = 'j';
            if(c == '9') c = 'i';
            if(c == '8') c = 'h';
            if(c == '7') c = 'g';
            if(c == '6') c = 'f';
            if(c == '5') c = 'e';
            if(c == '4') c = 'd';
            if(c == '3') c = 'c';
            if(c == '2') c = 'b';
            if(c == '1') c = 'a';
            if(c == '0') c = 'z';
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}