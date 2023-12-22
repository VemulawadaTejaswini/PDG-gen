import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int total = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 1; i<=n; i++) {
//            System.out.println(L+i-1);
            total += L+i-1;
            //System.out.println(Math.abs(L+i-1));
            if(Math.abs(L+i-1) < Math.abs(min)) {
                min = L + i - 1;
            }
        }
//        System.out.println(total + " "+ min);
        System.out.println(total-min);

    }
}