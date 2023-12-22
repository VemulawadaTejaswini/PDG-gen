import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] orderTimes = new int[5];

        for (int i=0; i<5; i++) {
            orderTimes[i] = sc.nextInt();
        }

        int lastOrder = 0;
        int sum = 0;

        for (int ot: orderTimes) {
            if (ot % 10 == 0) {
                sum += ot;
            } else {
                if (lastOrder == 0) {
                    lastOrder = ot;
                    continue;
                }

                if (lastOrder % 10 <= ot % 10) {
                    sum += ot;
                    sum += 10 - (ot % 10);
                } else {
                    sum += lastOrder;
                    sum += 10 - (lastOrder % 10);
                    lastOrder = ot;
                }
            }
        }
        System.out.println(sum + lastOrder);
    }
}

