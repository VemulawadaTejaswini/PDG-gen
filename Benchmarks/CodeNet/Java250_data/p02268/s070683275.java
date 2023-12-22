import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = Integer.parseInt(sc.next());
    static int[] a = new int[100000];

    public static void main(String[] args){
        int q,key,sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            key = Integer.parseInt(sc.next());
            if(binarySearch(key)) sum++;
        }
        System.out.println(sum);
    }

    static boolean binarySearch(int key){
        int left = 0;
        int right = n;
        int mid;
        while(left < right){
            mid = (left + right)/2;
            if(key == a[mid]) return true;
            if (key > a[mid]) left = mid + 1;
            else if (key < a[mid]) right = mid;
        }
        return false;
    }
}
