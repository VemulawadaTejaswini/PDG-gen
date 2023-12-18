import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        insertionSort(createArray(n), n);
    }
    
    private static int[] createArray(int n) {
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) {
            ary[i] = scn.nextInt();
        }
        return ary;
    }
    
    private static void showArray(int[] ary) {
        StringBuilder sb = new StringBuilder();
        for(int elm : ary) {
            sb.append(elm + " ");
        }
        System.out.println(sb.toString().trim());
    }
    
    private static void insertionSort(int[] ary, int n) {
        showArray(ary);
        for(int i = 1; i < n; i++) {
            int v = ary[i];
            int j = i - 1;
            while(j >= 0 && ary[j] > v) {
                ary[j + 1] = ary[j];
                j--;
            }
            ary[j + 1] = v;
            showArray(ary);
        }
    }
}