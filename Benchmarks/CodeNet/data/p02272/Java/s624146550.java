import java.util.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //数列Sの長さ
        int[] s = new int[n]; //数列S
        for (int i=0; i<n; i++) {
            s[i] = sc.nextInt();
        }
        //マージソート
        mergeSort(s,0,n); //配列、０、配列の長さ
        //出力
        System.out.print(s[0]);
        for (int i=1; i<n; i++) {
            System.out.print(" " + s[i]);
        }
        System.out.println();
        System.out.println(count);
    }
    /**
     * マージソート
     */
    static void mergeSort(int[] s, int left, int right) {
        if(left+1 < right) {
            int mid = (left+right)/2;
            mergeSort(s, left, mid); //先頭から中間まで
            mergeSort(s, mid, right); //中間から末尾まで
            merge(s,left,mid,right); //二つの配列を結合する
        }
    }
    /**
     * マージ
     */
    static void merge(int[] s, int left, int mid, int right) {
        int n1 = mid-left;
        int n2 = right-mid;
        int[] a = new int[n1+1];
        int[] b = new int[n2+1];
        for(int i=0; i<n1; i++) a[i] = s[left+i];
        for(int i=0; i<n2; i++) b[i] = s[mid+i];
        a[n1] = Integer.MAX_VALUE;
        b[n2] = Integer.MAX_VALUE;
        int i=0, j=0;
        for (int k=left; k<right; k++) {
            count++;
            if(a[i]<=b[j]) {
                s[k] = a[i];
                i++;
            } else {
                s[k] = b[j];
                j++;
            }
        }
    }
}

