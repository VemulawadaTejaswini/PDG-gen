import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            while(true) {
                int num = scn.nextInt();
                char[][] abacus = new char[8][5];
                for(int i = 0; i < abacus.length; i++) {
                    Arrays.fill(abacus[i], i != 2 ? '*' : '=');
                }
                for(int i = 0; i < 5; i++) {
                    int now = num / (int)Math.pow(10, 4 - i) % 10;
                    abacus[now > 4 ? 0 : 1][i] = ' ';
                    abacus[now % 5 + 3][i] = ' ';
                }
                for(char[] ary : abacus) {
                    System.out.println(ary);
                }
                if(scn.hasNextInt()) {
                    System.out.println();
                } else {
                    break;
                }
            }
        }
    }
}