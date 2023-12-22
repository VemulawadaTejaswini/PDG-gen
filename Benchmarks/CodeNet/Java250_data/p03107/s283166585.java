import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] arr = sc.next().toCharArray();

        int cnt1 = 0;
        int cnt0 = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]=='1') cnt1++;
            if (arr[i]=='0') cnt0++;
        }

        int ans = arr.length;

        int diff = Math.abs(cnt0-cnt1);

        System.out.println(ans-diff);
    }

}
