import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        Map<Long,Long> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+b[i]);
            }else {
                map.put(a[i],b[i]);
            }
        }
        Arrays.sort(a);
        long ans = 0;
        long count = 0;
        for(int i = 0;i<n;i++){
            if (i!=0 && a[i] == a[i-1]) continue;
            if(count+map.get(a[i])>m){
                ans+=a[i]*(m-count);
                count=m;
            }else {
                ans+=a[i]*map.get(a[i]);
                count+=map.get(a[i]);
            }
            if(count>=m)break;
        }
        System.out.println(ans);
    }
}
