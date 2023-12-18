import java.util.*;

class Main{
    static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] S = new int[n];
        for(int i = 0;i < n;i++){
            S[i] = sc.nextInt();
        }

        mergeSort(S);

        for(int i = 0;i < n;i++){
            if(i != 0)  System.out.print(" ");
            System.out.print(S[i]);
        }
        System.out.println();
        System.out.println(count);
    }

    /* 2つの配列LとRを併合してAを作成 */
    static void merge(int[] L,int [] R,int[] A){
        int i = 0,j = 0;    //カウンタ
        while(i < L.length || j < R.length){
            if(j >= R.length || (i < L.length && L[i] < R[j])){
                A[i + j] = L[i];
                count++;
                i++;
            }
            else{
                A[i + j] = R[j];
                count++;
                j++;
            }
        }
    }

    /* データのソート */
    static void mergeSort(int[] A){
        if(A.length > 1){
            int m = A.length / 2;
            int n = A.length - m;
            int[] L = new int[m];
            int[] R = new int[n];
            for(int i = 0;i < m;i++)    L[i] = A[i];
            for(int i = 0;i < n;i++)    R[i] = A[m + i];
            mergeSort(L);
            mergeSort(R);
            merge(L,R,A);
        }
    }
}
