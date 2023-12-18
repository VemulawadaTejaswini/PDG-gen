import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] lines = br.readLine().split(" ");
            int h = Integer.parseInt(lines[0]);
            int w = Integer.parseInt(lines[1]);
            if (h == 0 && w == 0) {
                break;
            }
            char[][] list = new char[h][w];
            int[][] root = new int[h][w];
            for (int i = 0; i < h; i++) {
                list[i] = br.readLine().toCharArray();
            }
            int x = 0;
            int y = 0;
            boolean isLoop = false;
            while (list[y][x] != '.') {
                switch (list[y][x]) {
                case '>':
                    x++;
                    break;
                case 'v':
                    y++;
                    break;
                case '<':
                    x--;
                    break;
                case '^':
                    y--;
                    break;
                case '.':
                    break;
                }
                root[y][x]++;
                if (root[y][x] == 2) {
                    isLoop = true;
                    break;
                }
            }
            if (isLoop) {
                System.out.println("LOOP");
            } else {
                System.out.println(x + " " + y);
            }
        }
    }
}

