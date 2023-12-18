import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int[][] Mat = new int[100][100];
    static int[] Start = new int[100];
    static int[] Finish = new int[100];
    static int n;



    public static void main(String[] argss){

        graph_input();
        dfs(0);
//        graph_output();
        print_answer();
    }

    public static void print_answer() {
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + " ");
            System.out.print(Start[i] + " ");
            System.out.print(Finish[i] + "\n");
        }
    }

    public static void dfs(int u) {
        Stack<Integer> stack = new Stack<Integer>();
        int time = 1;
        int v;

        stack.push(u);
        Start[u] = time++;

        while (!stack.empty()){
            u = stack.peek();
            v = next_vertex(u);

            if (v != 0){
                if (Start[v] == 0){
                    Start[v] = time++;
                    stack.push(v);
                }
            }
            else {
                stack.pop();
                Finish[u] = time++;
            }
        }
    }

    public static int next_vertex(int u) {
        for (int i = 0; i < n; i++) {
            if (Mat[u][i] != 0){
                Mat[u][i] = 0;
                return i;
            }
        }
        return 0;
    }

    public static void graph_output() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Mat[i][j]);
                if (j != n - 1)
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void graph_input() {

        n = scanner.nextInt();

        int u, k, v;
        for (int i = 0; i < n; i++) {
            u = scanner.nextInt();
            k = scanner.nextInt();
            for (int j = 0; j < k; j++) {
                v = scanner.nextInt();
                Mat[u-1][v-1] = 1;
            }
        }
    }
}