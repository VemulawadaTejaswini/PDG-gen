import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(list);
        int answer = 0;
        for (int i = 0; i < 2; i++) {
            answer += list.get(i);
        }

        System.out.println(answer);
        sc.close();
    }
}