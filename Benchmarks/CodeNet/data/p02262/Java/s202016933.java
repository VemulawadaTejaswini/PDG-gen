import java.util.*;

public class Main {
    static long cnt = 0;
    static ArrayList<Integer> G = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        shellSort(A, N);

        String ansG = "";
        for (int i = G.size()-1; i >= 0; i--) {
            ansG += G.get(i) + " ";
        }
        System.out.println(G.size());
        System.out.println(ansG.substring(0,ansG.length()- 1));
        System.out.println(cnt);
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }

    static void insertionSort(int[] A, int n, int g){
        int v, j;
        for (int i = g; i < n; i++) {
           v = A[i];
           j = i - g;
           while (j >= 0 && A[j] > v){
               A[j+g] = A[j];
               j -= g;
               cnt++;
           }
           A[j+g] = v;
        }
    }

    static void shellSort(int[] A, int n){
        for (int i = 1; i <= n; i = 3*i + 1) {
            G.add(i);
        }

        //System.out.println(G);

        for (int i = G.size()-1; i >= 0; i--) {
            insertionSort(A, n, G.get(i));

        }
    }
}
