import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String args[]){
        Set<Integer> set = new HashSet<Integer>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int dCount = 0;

        while(dCount < k) {
            int d = sc.nextInt();
            for(int i = 0;i < d;i++){
                set.add(sc.nextInt());
            }
            dCount++;
        }

        System.out.print(n - set.size());
    }

}
