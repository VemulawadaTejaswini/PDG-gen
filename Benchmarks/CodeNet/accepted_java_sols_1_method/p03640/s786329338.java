import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }

       int[][] s = new int[h][w];
       List<Integer> list = new ArrayList<Integer>();
       for (int i = 0 ; i < n ; i++) {
           for (int j = 0; j < a[i] ; j++) {
               list.add(i + 1);
           }
       }
       int index = 0;
       for (int i = 0 ; i < h ; i++) {
           for (int j = 0 ; j < w ; j++) {
               if (i % 2 == 1) {
                   s[i][j] = list.get(index);
                   index++;
               } else {
                   s[i][w - 1 - j] = list.get(index);
                   index++;
               }

           }
       }

       for (int i = 0 ; i < h ; i++) {
           for (int j = 0 ; j < w ; j++) {
               System.out.print(s[i][j] + " ");
           }
           System.out.print("\n");
       }

    }

}