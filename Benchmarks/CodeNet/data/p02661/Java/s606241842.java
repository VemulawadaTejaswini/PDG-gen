import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n], B = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            map.merge(A[i], 1, Integer::sum);
            map.merge(B[i]+1, -1, Integer::sum);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int medMin = A[(n-1)/2];
        int medMax = B[n/2]+1;
        int pre = -1, cnt = 0, ans = 0;
        for(int k : map.keySet()){
            if(medMax == k){
                ans += medMax - pre;
                break;
            }
            cnt += map.get(k);
            if(medMin == k) pre = medMin;
            else if(medMin < k){
                if(0 < cnt && pre == -1) pre = k;
                else if(cnt == 0){
                    ans += k - pre; pre = -1;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
