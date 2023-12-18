import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for(int i = 0; i < N; i++) d[i] = sc.nextInt();

        //餅を昇順に並び替える
        Arrays.sort(d);
      
        //隣同士が異なればカウント（最低1個ある）
        int count = 1;
        for(int i = 0; i < N - 1; i++){
            if(d[i] != d[i+1]) count++;
        }
        System.out.println(count);
    }
}
