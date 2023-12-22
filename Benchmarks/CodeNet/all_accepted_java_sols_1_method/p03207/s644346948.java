import java.util.*;

public class Main {
    static HashSet<Integer> dic = new HashSet<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++) p[i] = sc.nextInt();
        int sum = 0;
        for(int w:p) sum += w;
        Arrays.sort(p);
        sum -= p[n-1]/2;
        System.out.println(sum);
    }
}