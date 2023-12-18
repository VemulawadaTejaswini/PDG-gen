import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://abc102.contest.atcoder.jp/tasks/abc102_b
public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(in.nextInt());
        }
        int max = Collections.max(a);
        int min = Collections.min(a);
        System.out.println(max - min);
    }
}
