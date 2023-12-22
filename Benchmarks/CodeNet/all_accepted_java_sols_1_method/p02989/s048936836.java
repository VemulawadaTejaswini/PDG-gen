import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

public class Main {

    static final int modnum = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(N);
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        list.sort(Comparator.naturalOrder());

        int a = list.get(N/2-1);
        int b = list.get(N/2);

        System.out.println(b-a);
    }
}