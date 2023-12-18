import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int[] a = new int[n];
        for (int i = n-1; i > -1; i--){
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n-1; i++){
            System.out.printf("%d ",a[i]);
        }
        System.out.println(a[n-1]);
    }
}
