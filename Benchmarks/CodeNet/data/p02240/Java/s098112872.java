import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int n, m, q;
    private static int t, s;

    public static void main (String[] args){

        n = scanner.nextInt();
        m = scanner.nextInt();

        int[] clusters = new int[n];

        clustering(clusters);
        questioning(clusters);
    }

    private static void questioning(int[] clusters) {

        q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            s = scanner.nextInt();
            t = scanner.nextInt();

            if (clusters[s] == clusters[t])
                System.out.print("yes\n");
            else
                System.out.print("no\n");
        }
    }

    private static void clustering(int[] clusters) {

        int cluster_num = 1;

        for (int i = 0; i < m; i++) {
            s = scanner.nextInt();
            t = scanner.nextInt();

            if (clusters[s] == 0 && clusters[t] == 0){
                clusters[s] = cluster_num;
                clusters[t] = cluster_num;
                cluster_num++;
            }
            else if(clusters[s] == 0){
                clusters[s] = clusters[t];
            }
            else if(clusters[t] == 0){
                clusters[t] = clusters[s];
            }
        }
    }
}