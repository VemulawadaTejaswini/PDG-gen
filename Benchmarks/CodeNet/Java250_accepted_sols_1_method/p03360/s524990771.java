import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> abc = new ArrayList<>();
        abc.add(sc.nextInt());
        abc.add(sc.nextInt());
        abc.add(sc.nextInt());
        Collections.sort(abc);
        int k = sc.nextInt();
        System.out.println((int) (abc.get(0) + abc.get(1) + abc.get(2) * Math.pow(2, k)));
    }

}
