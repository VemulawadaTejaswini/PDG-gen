import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i <= a; i++) {
            int tmp = 0;
            int count = 2;
            while(tmp <= a) {
                tmp = (int) Math.pow(i, count);
                if(tmp <= a) {
                    count++;
                    list.add(tmp);
                }
            }
        }
        System.out.println(Collections.max(list));
    }
}