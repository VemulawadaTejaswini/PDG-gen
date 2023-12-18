import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> e = new LinkedList<>();
        Object[] each;

        for(int i = 0; i < 12; i++) {
            e.add(sc.nextInt());
        }

        if(e.stream().distinct().count() > 3) {
            System.out.println("no");
            return;
        }
        Collections.sort(e);
        each = e.stream().distinct().toArray();
        for(Object a : each) {
            if(e.stream().filter(i -> i == a).count() != 4) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}