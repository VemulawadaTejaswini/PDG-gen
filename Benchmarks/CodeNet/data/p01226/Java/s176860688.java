import java.util.Scanner;

public class Main {
    final double EPS = 1.0e-10;
    final int INF = 1 << 28;

    void run() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (true) {
            if (t == 0)
                break;
            int h = sc.nextInt();
            int w = sc.nextInt();
            char[][] map = new char[h][w];
            for (int i = 0; i < h; i++) {
                map[i] = sc.next().toCharArray();
            }
            int n = 0;
            char[] ord = new char[n = sc.nextInt()];
            ord = sc.next().toCharArray();
            // . 平地
            // * レンガの壁
            // # 鉄の壁
            // - 水
            // ^ 戦車（上向き）
            // v 戦車（下向き）
            // < 戦車（左向き）
            // > 戦車（右向き）
            //
            // プレイヤーの入力は文字の列で与えられる． 各文字に対応する動作は表2の通りである．
            // 表2: プレイヤーの入力に対する動作 文字 動作

            int x = 0;
            int y = 0;
            int d = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == '^') {
                        x = j;
                        y = i;
                        d = 0;
                        break;
                    } else if (map[i][j] == '>') {
                        x = j;
                        y = i;
                        d = 1;
                        break;
                    } else if (map[i][j] == '<') {
                        x = j;
                        y = i;
                        d = 2;
                        break;
                    } else if (map[i][j] == 'v') {
                        x = j;
                        y = i;
                        d = 3;
                        break;
                    }
                }
            }
            int dx[] = { 0, 1, -1, 0 };
            int dy[] = { -1, 0, 0, 1 };
            for (int i = 0; i < n; i++) {
                switch (ord[i]) {
                // U Up: 戦車を上向きに方向転換し，さらに一つ上のマスが平地ならばそのマスに移動する
                // D Down: 戦車を下向きに方向転換し，さらに一つ下のマスが平地ならばそのマスに移動する
                // L Left: 戦車を左向きに方向転換し，さらに一つ左のマスが平地ならばそのマスに移動する
                // R Right: 戦車を右向きに方向転換し，さらに一つ右のマスが平地ならばそのマスに移動する
                // S Shoot: 戦車が現在向いている方向に砲弾を発射する
                case 'U':
                    map[y][x] = '^';
                    d = 0;
                    if (y - 1 >= 0 && map[y - 1][x] == '.') {
                        map[y--][x] = '.';
                        map[y][x] = '^';
                    }
                    break;
                case 'D':
                    map[y][x] = 'v';
                    d = 3;
                    if (y + 1 < h && map[y + 1][x] == '.') {
                        map[y++][x] = '.';
                        map[y][x] = 'v';
                    }
                    break;
                case 'L':
                    map[y][x] = '<';
                    d = 2;
                    if (x - 1 >= 0 && map[y][x - 1] == '.') {
                        map[y][x--] = '.';
                        map[y][x] = '<';
                    }
                    break;
                case 'R':
                    map[y][x] = '>';
                    d = 1;
                    if (x + 1 < w && map[y][x + 1] == '.') {
                        map[y][x++] = '.';
                        map[y][x] = '>';
                    }
                    break;
                case 'S':
                    int nx = x;
                    int ny = y;
                    while (true) {
                        nx = nx + dx[d];
                        ny = ny + dy[d];
                        if (nx < 0 || nx >= w || ny < 0 || ny >= h)
                            break;
                        if (map[ny][nx] == '#')
                            break;
                        if (map[ny][nx] == '*') {
                            map[ny][nx] = '.';
                            break;
                        }
                    }
                    break;
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
            t--;
            if (t != 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}