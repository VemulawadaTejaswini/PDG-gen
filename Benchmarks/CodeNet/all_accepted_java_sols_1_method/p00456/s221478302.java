import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            list1.add(sc.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            list2.add(sc.nextInt());
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        int res1 = list1.get(9) + list1.get(8) + list1.get(7);
        int res2 = list2.get(9) + list2.get(8) + list2.get(7);
        
        System.out.println(res1 + " " + res2);
    }
}