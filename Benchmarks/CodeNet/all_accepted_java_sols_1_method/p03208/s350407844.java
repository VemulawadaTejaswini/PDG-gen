import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> trees = new ArrayList<Integer>();
        for(int i =0; i< N; ++i) {
            trees.add(sc.nextInt());
        }
        Collections.sort(trees);
        //WRONG
        int h_min = trees.get(0);
        int h_max = trees.get(K-1);
        /*
        System.out.println(h_min);
        System.out.println(h_max);
        System.out.println(h_max - h_min);
        */
        int min_diff = Integer.MAX_VALUE;
        for(int i =0 ; i <= N - K; ++i) {
            h_min = trees.get(i);
            h_max = trees.get(i + K-1);
            int diff = h_max - h_min;
          //System.out.println(h_min);
          //System.out.println(h_max);
            //System.out.println(diff);
            if(diff< min_diff) {
                min_diff = diff;
            }
        }
        System.out.println(min_diff);
    }

}
