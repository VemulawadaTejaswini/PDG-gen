import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[N + 1];
        for(int i = 0; i < N - 1; i++) {
            int input = sc.nextInt();
            count[input]++;
        }
        for(int i =0 ; i < N ; i++) {
            System.out.println(count[i + 1]);
        }
    }
}
