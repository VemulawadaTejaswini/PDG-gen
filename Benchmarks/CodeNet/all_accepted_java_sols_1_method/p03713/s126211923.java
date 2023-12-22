import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long ans = Math.min(h, w);
        if(h % 3 == 0 || w % 3 == 0){
            ans = 0;
        }else{
            long whalf = w / 2;
            long hhalf = h / 2;
            for (int i = 1; i <= (h+1)/2; i++) {
                long s1 = w * i;
                long s2 = whalf * (h - i);
                long s3 = (w - whalf) * (h - i);
                long max = Math.max(s1, Math.max(s2, s3));
                long min = Math.min(s1, Math.min(s2, s3));
                ans = Math.min(ans, max - min);
            }
            for (int i = 1; i <= (w+1)/2; i++) {
                long s1 = h * i;
                long s2 = hhalf * (w - i);
                long s3 = (h - hhalf) * (w - i);
                long max = Math.max(s1, Math.max(s2, s3));
                long min = Math.min(s1, Math.min(s2, s3));
                ans = Math.min(ans, max - min);
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
