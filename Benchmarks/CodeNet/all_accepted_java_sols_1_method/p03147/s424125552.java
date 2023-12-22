import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for (int i =0; i<N; i++) {
            h[i] = sc.nextInt();
        }

        int count = 0;
        for(;true;){
            boolean flag = false;

            for (int i = 0; i<N; i++) {
                if (h[i] > 0) {
                    flag = true;
                    h[i]--;
                }
                else if ((flag && h[i] == 0)) {
                    break;
                }
            }
          	
          if (flag){
            count++;
          }

            boolean check = true;
            for (int i = 0; i<N; i++) {
                if (h[i]>0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                System.out.println(count);
                return;
            }
        }
    }

}