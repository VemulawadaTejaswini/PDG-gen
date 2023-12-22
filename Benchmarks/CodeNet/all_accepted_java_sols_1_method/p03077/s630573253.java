import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();
        long a[] = new long[5];
        for(int i = 0;i<5;i++){
            a[i] = sc.nextLong();
            sc.nextLine();
        }
        Arrays.sort(a);
        long ans = 4;
        ans += n / a[0];
        if(n % a[0] != 0){
            ans += 1;
        }
        System.out.println(ans);
    }
}