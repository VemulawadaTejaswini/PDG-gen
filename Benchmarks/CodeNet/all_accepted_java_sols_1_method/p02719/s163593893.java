import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                long n = sc.nextLong();
                long k = sc.nextLong();
                System.out.println(Math.min(n % k , -1 * (n % k - k)));
                sc.close();
        }
}
//おやつ食べました
//昔解けなかった問題が解けるようになっていて感動しました
//こんなこと言ってWAが出たら鳴くのでACを出せ