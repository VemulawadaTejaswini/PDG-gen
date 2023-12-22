import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(!m.containsKey(a[i])) m.put(a[i], 1);
            else m.put(a[i], m.get(a[i]) + 1);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(m.containsKey(a[i])){
                if(a[i] <= m.get(a[i])) ans += m.get(a[i]) - a[i];
                else ans += m.get(a[i]);
                m.remove(a[i]);
            }
        }
        System.out.println(ans);
    }
}