import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), w = in.nextInt();
        in.nextLine();
        char[][] field = new char[h + 2][w + 2];
        for(int i = 1; i <= h; i++)  {
            String str = in.nextLine();
            for(int j = 1; j <= w; j++) {
                field[i][j] = str.charAt(j- 1);
            }
        }
        for(int i = 1; i <= h; i++)  {
            for(int j = 1; j <= w; j++) {
                if(field[i][j] == '#' &&
                field[i-1][j] != '#' && field[i][j-1] != '#' &&
                field[i+1][j] != '#' && field[i][j+1] != '#') {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}