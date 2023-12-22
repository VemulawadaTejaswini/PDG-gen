import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int min = 1;
        int max = N;
        for(int i=0; i<M; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            if(L > min && L <= max) min = L;
            if(L > min && L > max) {
                System.out.println(0);
                return;
            }
            if(R < max && R >= min) max = R;
            if(R < max && R < min) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(max-min+1);
    }
}