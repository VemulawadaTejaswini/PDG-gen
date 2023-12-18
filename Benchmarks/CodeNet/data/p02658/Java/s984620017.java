import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        long answer = 1;
        long check = 1000000000000000000L;
        long[] y = new long[x];
        boolean flag = false;
        for (int i = 0; i < x; i++) {
            y[i] = Long.parseLong(sc.next());
            if (y[i] == 0) {
                flag = true;
            }
        }
        for (int i = 0; i < x; i++) {
            if (flag) {
                answer = 0;
                break;
            } else if (answer * y[i] > Long.MAX_VALUE) {
                answer = -1;
                break;
            } else if (answer * y[i] > check) {
                answer = -1;
                break;
            } else {
                answer *= y[i];
            }
        }
        
        System.out.println(answer);
    }
}