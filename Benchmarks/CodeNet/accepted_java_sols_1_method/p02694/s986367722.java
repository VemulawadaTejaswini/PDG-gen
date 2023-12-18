import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        double money = 100;


        for (int i = 1; i < 1000000; i++) {
            money = Math.floor((double)money * 1.01);

            if (money >= a){
                System.out.println(i);
                return;
            }

        }

        sc.close();
    }

}