import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            scores.add(in.nextInt());
        }
        scores.sort(Comparator.naturalOrder());
        System.out.println(scores.get(n / 2) - scores.get(n / 2 - 1));
    }
}
