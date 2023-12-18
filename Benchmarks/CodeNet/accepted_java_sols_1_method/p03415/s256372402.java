import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        boolean[][] mark = {{true, false, false},{false, true, false}, {false, false, true}};
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        char[] chars;
        for (int i = 0; i < 3; i++) {
            chars = sc.next().toCharArray();
            for (int j = 0; j < 3; j++) {
                if (mark[i][j]) {
                    sb.append(chars[j]);
                }
            }
        }
        System.out.println(sb.toString());
    }
    
}
