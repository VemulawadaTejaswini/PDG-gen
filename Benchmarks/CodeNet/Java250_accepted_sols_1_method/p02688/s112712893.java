import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Map<Integer, Boolean> list = new HashMap<>();
        for (int i = 1; i <=N+1; i++) {
            list.put(i, true);
        }
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
            for(int j = 0;j<d;j++){
                int A = sc.nextInt();
                if(list.get(A)){
                    list.put(A,false);
                }
            }

                }





        int ans = 0;
        for (int i = 1; i <+ N+1; i++) {
            if(list.get(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }

}

