import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000000;
        boolean[] l = new boolean[n+1];
        int[] c=new int[n+1];
        l[1] = true;
        c[1]=1;
        for (int i = 2; i <= n; i++) {
            if(i%2==0&&l[i/2])l[i]=true;
            if(i%3==0&&l[i/3])l[i]=true;
            if(i%5==0&&l[i/5])l[i]=true;
            c[i]=c[i-1]+(l[i]?1:0);
        }
        for (;;) {
            int s = sc.nextInt();
            if (s == 0) {
                break;
            }
            int f = sc.nextInt();
//            int count = 0;
//            for (int i = s; i <= f; i++) {
//                if (l[i]) {
//                    count++;
//                    System.out.println(i);
//                }
//            }
//            System.out.println(count);
            System.out.println(c[f]-c[s]);
        }
    }
}
