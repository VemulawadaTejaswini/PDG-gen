import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        scan.nextLine();
        List<Integer> hList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).sorted((x, y) -> y - x).collect(Collectors.toList());

        long count = 0;
        for(int i=0; i<hList.size(); i++) {
            if(k > 0) {
                k--;
                continue;
            }
            count += hList.get(i);
        }
        System.out.println(count);
    }
}