import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Integer> numlist = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numlist.add(Integer.parseInt(sc.next()));
        }
        numlist.sort(Comparator.reverseOrder());
        int Alice = 0;
        int Bob = 0;
        for (int i = 0; i < numlist.size(); i++) {
            if (i % 2 == 0) {
                Alice += numlist.get(i).intValue();
            } else {
                Bob += numlist.get(i).intValue();
            }
        }
        System.out.println(Alice - Bob);
    }
}