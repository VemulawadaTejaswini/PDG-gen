import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> xs = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            xs.add(sc.nextInt());
        }

        int n = 0;
        while (true) {
            if (xs.stream().allMatch((x) -> x % 2 == 0)) {
                xs = xs.stream().map((x) -> x / 2).collect(Collectors.toList());
                n++;
            }
            else {
                break;
            }
        }

        System.out.println(n);
    }
}
