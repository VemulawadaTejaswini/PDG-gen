import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> S = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) S.add(sc.nextInt());
        int q = sc.nextInt();
        int count = 0;
        for (int i = 0; i < q; i++)
        {
            int in = sc.nextInt();
            if(S.contains(in))count++;
        }
        System.out.println(count);

    }

}