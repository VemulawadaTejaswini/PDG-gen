import java.util.*;

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int k = sc.nextInt();
            if(k == 0)  break;
            int sum = 0;

            for(int i = 0; i < k * (k-1)/2; i++) {
                sum += sc.nextInt();
            }

            System.out.println(sum / (k-1));
        }

    }
}