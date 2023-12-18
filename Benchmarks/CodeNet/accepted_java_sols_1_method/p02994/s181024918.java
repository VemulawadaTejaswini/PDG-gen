import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int total = n*(l-1)+n*(n+1)/2;
        if (0<l)total-=l;
        else if (-n>=l)total-=l+n-1;
        System.out.println(total);

    }
}
