import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n]; Map<Integer, Integer> map = new HashMap<>(); long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); sum += a[i];
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int b = sc.nextInt(); int c = sc.nextInt();
            int frq = map.get(b);
            sum += ((long) c - b) * frq;
            System.out.println(sum);
            map.remove(b);
            map.put(c, map.getOrDefault(c, 0) + frq);
        }
    }


}