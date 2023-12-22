import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            p.add(i, scanner.nextInt());
        }
        List<Integer> q = p.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(p.get(i) != q.get(i)){
                count++;
            }
        }
        if(count == 2 || count == 0) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}