import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    static List<Node> list = new ArrayList();

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int w = scan.nextInt();
            int h = scan.nextInt();
            if (w == 0 && h == 0) {
                break;
            }
            int[][] c = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    c[i][j] = scan.nextInt();
                }
            }
            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (c[i][j] == 1) {
                        c=addList(c, list, i, j, h, w);
                        while (true) {
                            if (list.size() == 0) {
                                break;
                            }
                            Node node = list.get(0);
                            list.remove(0);
                            c=addList(c, list, node.y, node.x, h, w);
                        }
                        count++;
                    }

                }
            }
            System.out.println(count);
        }
    }

    private static int[][] addList(int[][] c, List list, int i, int j, int h, int w) {
        for (int y = -1; y < 2; y++) {
            for (int x = -1; x < 2; x++) {
                if (i + y < 0 || j + x < 0 || i + y >= h || j + x >= w) {
                    continue;
                }
                if (x == 0 && y == 0) {
                    continue;
                }
                if (c[i + y][j + x] == 1) {
                    c[i + y][j + x] = 0;
                    Node node = new Node();
                    node.setX(j + x);
                    node.setY(i + y);
                    list.add(node);
                }
            }
        }
        return c;
    }
}

class Node {
    int x, y;

    public void setX(int a) {
        x = a;
    }

    public void setY(int a) {
        y = a;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
