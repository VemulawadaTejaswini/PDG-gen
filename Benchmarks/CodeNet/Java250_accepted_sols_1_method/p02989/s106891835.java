import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dif = new int[n];
        for(int i = 0; i < n; i++) dif[i] = sc.nextInt();
        Arrays.sort(dif);
        System.out.println(dif[n / 2] - dif[n / 2 - 1]);
    }
}