import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(sc.next()));
        }
        int count = 0;
        while(arrayList.stream().allMatch(e -> e % 2 == 0)) {
            arrayList = arrayList.stream().map(e -> e / 2).collect(Collectors.toList());
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
