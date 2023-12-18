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

        for (int i = 0; i < n; i++) {
            boolean flgup = false;
            boolean flgdown = false;
            for (int j = i; j < n; j++) {
                if (array[i] < array[j]){
                    flgup = true;
                }
                if (array[i] > array[j]){
                    flgdown = true;
                }
            }

            if (stock == 0) {
                if (flgup == true) {
                    stock = money / array[i];
                    money = money % array[i];
                }
            } else {
                if (flgdown == true || i == n - 1) {
                    money += stock * array[i];
                    stock = 0;
                    }
                }
            }
        System.out.println(money);

        sc.close();

        }



    }

