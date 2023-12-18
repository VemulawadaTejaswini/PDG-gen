import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        int N = input.nextInt();
        Integer[] d = new Integer[N];
        for (int i = 0; i < N; i++){
            d[i] = input.nextInt();
        }
        Arrays.sort(d,Comparator.reverseOrder());
        int now = 0;
        int ans = 0;
        for (int i = 0; i < N; i++){
            if (now != d[i]){
                ans += 1;
                now = d[i];
            }
        }
        System.out.println(ans);
    }
}