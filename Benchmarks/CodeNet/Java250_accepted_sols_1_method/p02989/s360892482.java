import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<N; i++){
            list.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(list);

        int a = N/2 - 1;
        int b = N/2;

        int t = list.get(a);
        int y = list.get(b);

        if (t == y){
            System.out.println("0");
            return;
        }

        int count = y - t;
        System.out.println(count);
    }
}