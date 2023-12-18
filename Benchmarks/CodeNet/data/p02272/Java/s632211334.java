import java.util.Scanner;
public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        
        mergeSort(s, 0, n);
        
        for (int i = 0; i < n - 1; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println(s[n-1]);
        
        System.out.println(count);
    }
    
    static void mergeSort(int[] a, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            
            mergeSort(a, left, mid);
            mergeSort(a, mid, right);
            
            merge(a, left, mid, right);
        }
    }
    
    static void merge(int[] a, int left, int mid, int right) {
//        U.println("l: " + left + ", r: " + right);
//        UArr.printArr(a);
        int n1 = mid - left;
        int n2 = right - mid;
        int[] aL = new int[n1 + 1];
        int[] aR = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            aL[i] = a[left + i];
        }
        for (int i = 0; i < n2; i++) {
            aR[i] = a[mid + i];
        }
        
        aL[n1] = Integer.MAX_VALUE;
        aR[n2] = Integer.MAX_VALUE;
        
        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {
            count++;
            if (aL[i] <= aR[j]) {
                a[k] = aL[i];
                i++;
            } else {
                a[k] = aR[j];
                j++;
            }
        }
//        UArr.printArr(a);
//        U.println();
    }
}

