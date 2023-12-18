import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int h = cin.nextInt();
        int w = cin.nextInt();
        cin.nextLine();
        char [][] lines = new char[h][];
        for (int i = 0; i < h; i++) {
            lines[i] = cin.nextLine().toCharArray();
        }
        for (int j = 0; j < h; j++) {
            for (int i = 0; i < w; i++) {
                if (lines[j][i] == '#') {
                    if (i < w - 1 && lines[j][i + 1] == '#') {
                        do {
                            i++;
                        } while (i < w - 1 && lines[j][i + 1] == '#');
                    } else {
                        if ((j == 0 || lines[j-1][i] == '.') && (j == h-1 || lines[j+1][i] == '.')) {
                            System.out.println("No");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Yes");

    }
}
