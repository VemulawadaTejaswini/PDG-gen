import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> red =  new HashMap<>();
        Map<Integer, Integer> blue = new HashMap<>();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            red.put(b[i], a[i]);
        }
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
            blue.put(c[i], sc.nextInt());
        }
        Arrays.sort(c);
        int ans = 0;
        for(int i = 0; i < n; i++){
            int bx = c[i];
            int by = blue.get(c[i]);
            int tmp = -1;
            for(int j = 0; j < n; j++){
                if(red.containsKey(b[j]) && a[j] < bx && b[j] < by){
                    tmp = Math.max(tmp, b[j]);
                }
            }
            if(tmp >= 0){
                ans++;
                red.remove(tmp);
            }
        }
        System.out.println(ans);
    }
}