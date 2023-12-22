import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Long> list = new ArrayList<>();
        long ans = 0;
        for(int i = 0;i<n;i++){
            long num = sc.nextLong();
            list.add(num);
            ans += num;
        }
        Collections.sort(list);
        Collections.reverse(list);
        if(k > n){
            k = n;
        }
        for(int i = 0;i<k;i++){
            ans -= list.get(i);
        }
        System.out.println(ans);
    }
}