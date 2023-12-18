import java.util.Arrays;
import java.util.Scanner;
public class Main {
    long kl,o,n,m,hun,p;
    long as;
    String op;
    Scanner sc = new Scanner(System.in);
    public void solve() {	
        n=sc.nextLong();
        long[] date=new long[n];
        for(o=0;o<n;o++) {
            date[o]=sc.nextLong();
        }
        Arrays.sort(date);
        for(o=1;o<n;o++) {
            as=date[o]+as;

        }
        System.out.println(as);
    }
    public static void main(String[] args) {
        new Main().solve();

    }
}
