import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n==0) {
            System.out.print(x);
            return;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            set.add(num);
        }

        int abs = 101;
        int z = x;
        for(int i=0; i<=101; i++) {
            if(!set.contains(i)) {
                if (Math.abs(x-i) < abs) {
                    abs = Math.abs(x-i);
                    z = i;
                }
            }
        }
        System.out.print(z);
        return;
    }
}