import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(s.nextInt());
        list.add(s.nextInt());
        list.add(s.nextInt());
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());

        System.out.println(result.size());
    }

}
