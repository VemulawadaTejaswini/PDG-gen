import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(scan.nextInt());
        }


        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) % arr.get(j) == 0) {
                    arr.remove(i--);
                    break;
                }

            }
        }
        System.out.println(arr.size());

    }
}