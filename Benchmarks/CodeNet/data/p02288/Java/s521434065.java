import java.util.Scanner;
 
public class Main {
    static int h;
 
    private static void maxHeapify(int[] a, int i) {
        int l = i * 2;
        int r = i * 2 + 1;
 
        int largest = (l <= h && a[l] > a[i])? l : i;
        if(r <= h && a[r] > a[largest]) largest = r;
 
        if(largest != i) {
            int tmp = a[i];
            a[i] = a[largest];
            a[largest] = tmp;
            maxHeapify(a, largest);
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        h = sc.nextInt();
        int[] a = new int[h + 1];
 
        for(int i = 1; i <= h; i++) {
            a[i] = sc.nextInt();
        }
 
        for(int i = h / 2; i >= 1; i--) {
            maxHeapify(a, i);
        }
 
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= h; i++) {
            sb.append(" ").append(a[i]);
        }
        System.out.println(sb);
 
        sc.close();
    }
}
