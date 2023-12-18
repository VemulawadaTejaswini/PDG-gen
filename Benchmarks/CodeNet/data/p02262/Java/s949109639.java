import java.util.Scanner;

class Main {
    static int cnt = 0;

    static void insertionSort(int[] A, int n, int g) {
        for (int i = g; i < n; i++) {
            int v = A[i];
            int j = i - g;
            while(j >= 0 && A[j] > v){
                A[j+g] = A[j];
                j -= g;
                cnt++;
            }
            A[j+g] = v;
        }
    }

    static void shellSort(int[] A, int n){
        int h = 1;
        int m = 0;
        while(h <= n){
            h = h*3+1; // シェルソートの幅はこれが良いとされているらしい(Knuth)
            m++;
        }
        System.out.println(m);

        int[] G = new int[m];
        G[0] = (h-1) / 3;
        
        for(int i = 1; i < m; i++){
            G[i] = (G[i-1] - 1) / 3 ;
        }

        for(int i = 0; i < m; i++){
            System.out.print((i == 0 ? "" : " ") + G[i] + (i == m-1 ? "\n" : ""));
        }

        for(int i = 0; i < m; i++){
            insertionSort(A, n, G[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }

        sc.close();
        shellSort(array, n);

        System.out.println(cnt);
        for(int i : array){
            System.out.println(i);
        }
    }
}
