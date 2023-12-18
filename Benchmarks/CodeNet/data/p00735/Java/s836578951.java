import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();

        for (int i = 2; i < 300000; i++) {
            if (i % 7 == 1 || i % 7 == 6)
                list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) % list.get(i) == 0) {
                    list.remove(j);
                    j--;
                }
            }
        }

        while (true) {
            int MSPrime = s.nextInt();
            if (MSPrime == 1) break;

            ans.clear();


            for (int i = 0; i < list.size(); i++) {
                int temp = list.get(i);
                if (MSPrime % temp == 0)
                    ans.add(temp);
            }

            System.out.print(MSPrime + ":");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(" " + ans.get(i));
            }
            System.out.println();

        }
    }
}