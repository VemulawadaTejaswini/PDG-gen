import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Long> list = new ArrayList<>();
        for(int i = 0; i < N; i++)
            list.add(new Long(in.nextLong()));

        long ans = 0;
        for(long v : list){
            while(v % 2 == 0){
                ans++;
                v /= 2;
            }
        }
        System.out.println(ans);
    }
}