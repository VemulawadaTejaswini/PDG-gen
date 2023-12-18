import java.util.Scanner;

public class Main{
    private int cnt;

    public static void main(String[] args){
        new Main();
    }

    public Main(){
      Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A[] = new int[100];

        for(int i=0;i<n;i++){
            A[i] = scan.nextInt();
        }
        shellSort(A, n);
        printArray(A, n);
    }

    public void isort(int A[], int n, int g){
        for(int i=g;i<n;i++){
            int v = A[i];
            int j = i - g;
            // 挿入先が見つかるまでループ
            // 挿入するため、見ていった要素を一個ずつ後方へズラす。
            while(j >=0 && A[j] > v){
                A[j+g] = A[j];
                j = j -g;
                cnt++;
            }
            // 見つけた挿入場所へ挿入。
            A[j+g] = v;
        }
    }

    public void shellSort(int A[], int n){
        cnt = 0;
        int i, m;
        int G[] = new int[3];
        if(n < 3){
            G[0] = n;
            G[1] = n-1;
            G[2] = 1;
            m = n;
        }else{
            m = 3;
            G[0] = n - n/3;
            G[1] = n/2;
            G[2] = 1;
            m = 3;
        }
        System.out.println(m);
        for(i=0;i<m-1;i++){
            System.out.print(G[i] + " ");
        }
        System.out.println(G[i]);

        for(i=0;i<m;i++){
            isort(A, n, G[i]);
        }
        System.out.println(cnt);
    }

    // 一列で表示
    public static void printArray(int A[], int n){
        int i;
        for(i=0;i<n;i++){
            System.out.println(A[i]);
        }
    }
}