import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void calc(int weight) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int count=0;
        int balanceWeight = 512;

        while (weight != 0) {
            if (weight >= balanceWeight) {
                weight -= balanceWeight;
                arr.add(balanceWeight);
                count++;
            }
            balanceWeight /= 2;
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
            if (i != 0) System.out.print(" ");
            else System.out.println();
        }
        arr.clear();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            calc(in.nextInt());
        }
    }
}

