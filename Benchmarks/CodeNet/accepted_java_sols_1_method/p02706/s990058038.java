import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[2];
        for(int i = 0;i < arr.length;i++) {
            arr[i] = scanner.nextLine();
        }

        String[] line1 = arr[0].split(" ");

        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);

        String[] line2 = arr[1].split(" ");

        int[] a = new int[line2.length];
        for (int i = 0; i < line2.length; i++) {
            a[i] = Integer.parseInt(line2[i]);
        }

        int sum = Arrays.stream(a).sum();

        if(sum > n){
            System.out.println(-1);
        }else{
            System.out.println(n - sum);
        }

        scanner.close();
    }
}
