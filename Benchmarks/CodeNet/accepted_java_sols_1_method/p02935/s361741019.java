import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        // System.out.println(Arrays.toString(list.toArray()));
        double tmp = list.get(0);
        double ans = 0;
        for(int i=1;i<N;i++){
            int p=list.get(i);
            tmp = (tmp+p)/2;
        }
        System.out.println(tmp);
    }
}