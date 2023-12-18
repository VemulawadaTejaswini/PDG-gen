import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ary = new int[N];
        for(int i = 0; i < N; i++){
            ary[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        int sum = 0;
        for(int num : ary){
            sum += num;
        }
        sum -= ary[N-1];
        System.out.println(ary[N-1] < sum ? "Yes" : "No");
    }
}
