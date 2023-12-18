import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] l = new int[6];
            for (int i = 0, s; i < 6; l[i++] = sc.nextInt())
                ;
            if (l[0] == 0) {
                break;
            }
            int[] count = new int[3];
            for (int i = 0; i < 3; i++) {
                int q=1;
                do {
                    q = l[i*2] * q % l[i*2+1];
                    count[i]++;
                } while (q != 1);
            }
            int x=count[0];
            int y=count[1];
            int tmp;
            while ((tmp = x % y) != 0) {
                x = y;
                y = tmp;
            }
            count[0]=count[0]*count[1]/y;
            x=count[0];
            y=count[2];
            while ((tmp = x % y) != 0) {
                x = y;
                y = tmp;
            }
            System.out.println(count[0]*count[2]/y);
        }
    }
}

