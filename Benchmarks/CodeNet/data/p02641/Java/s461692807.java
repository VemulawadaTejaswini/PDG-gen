import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        Arrays.sort(ar);

        int y = Arrays.binarySearch(ar,x);

        int d = y < 0 ? -y-2: y;
        int left = ar[d];
        for (int i = ar[d]; i >=0 ; i--) {
            if(Arrays.binarySearch(ar,i) < 0){
                left = i;
                break;
            }
        }

        int right = ar[d];
        for (int i = 0; i < ar[d] ; i++) {
            if(Arrays.binarySearch(ar,i) < 0){
                right = i;
                break;
            }
        }

        if(Math.abs(x-right) <Math.abs(x-left)){
            System.out.println(right);
        }else{
            System.out.println(left);
        }

    }
}
