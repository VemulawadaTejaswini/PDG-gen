import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        ArrayList<Long> listSorted = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long tmp = sc.nextLong();
            list.add(tmp);
            listSorted.add(tmp);
        }
        Collections.sort(listSorted);
        Long midL = listSorted.get(n / 2 - 1);
        long midR = listSorted.get(n / 2);
        for (int i = 0; i < n; i++) {
            if(list.get(i) > midL) {
                System.out.println(midL);
            } else {
                System.out.println(midR);
            }
        }
    }
}