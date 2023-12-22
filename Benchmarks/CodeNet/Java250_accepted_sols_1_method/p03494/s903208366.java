import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        int N = sc.nextInt();
        int[] tmp = new int[N];
        for(int i = 0; i<N; i++) {
            tmp[i] = sc.nextInt();
        }
        while(true) {
            for(int i = 0; i<N; i++){
                if(tmp[i] % 2 != 0) {
                    flag = false;
                    break;
                }
                tmp[i] /= 2;
            }

            if (flag == false) break;
            count++;
        }
        System.out.println(count);
    }
}