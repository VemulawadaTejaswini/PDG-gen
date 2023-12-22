import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        int result = sc.nextInt();
        for(int i=1;i<N;i++){
            int big =  sc.nextInt();
            int small = result;
            while(big % small != 0){
                int temp = big;
                big = small;
                small = temp % small;
            }
            result = Math.min(result,small);

        }
        System.out.println(result);

    }
}
