import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long K = Long.parseLong(sc.next());
        int[] a = new int[N];
        long[] b = new long[N];
        //a[i]をキーとしてb[i]の和をバリューに
        Map<Integer, Long> map = new TreeMap<>();
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Long.parseLong(sc.next());
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i])+b[i]);
            else map.put(a[i], b[i]);
        }
        long sum = 0;
        int ans = 0;
        for(int i : map.keySet()) {
            //小さいキーから取り出し、バリューをsumに足し合わせる
            //sumがKを超えた時のキーが答え
            sum += map.get(i);
            if(sum >= K) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        
    }   
}
