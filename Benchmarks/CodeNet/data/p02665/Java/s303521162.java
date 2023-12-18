import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] leaves = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            leaves[i] = scanner.nextInt();
        }

        int totalNodes = 0;
        int[] nodes = new int[n + 1];
        if (n == 0 && leaves[0] == 0) {
            totalNodes = -1;
        } else {
            nodes[0] = 1;
            for (int i = 0; i < n; i++) {
                nodes[i + 1] = 2 * (nodes[i] - leaves[i]);
                if (nodes[i + 1] < 0) {
                    totalNodes = -1;
                    break;
                }
            }
            if (nodes[n] < leaves[n]) {
                totalNodes = -1;
            } else if (nodes[n] > leaves[n]) {
                nodes[n] = leaves[n];
                for (int i = n; i > 0; i--) {
                    int temp = nodes[i] + leaves[i - 1];
                    if (temp <= nodes[i - 1]) {
                        nodes[i - 1] = temp;
                    } else {
                        temp = (int) Math.ceil((double) nodes[i] / 2)
                                + leaves[i - 1];
                        if (temp <= nodes[i - 1]) {
                            nodes[i - 1] = temp;
                        } else {
                            totalNodes = -1;
                            break;
                        }
                    }
                }
            }
        }

        if (totalNodes == -1) {
            System.out.println(totalNodes);
        } else {
            for (int i = 0; i < nodes.length; i++) {
                totalNodes += nodes[i];
            }
            System.out.println(totalNodes);
        }
    }
}