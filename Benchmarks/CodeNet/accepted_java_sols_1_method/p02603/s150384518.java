import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long array[] = new long[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }

        long money = 1000;
        long stock = 0;

        long min = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                stock = money / min;
                money = money % min;

                money += stock * array[i];
                stock = 0;

                min = array[i];
            }

            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println(money);

        sc.close();

        }

    }

