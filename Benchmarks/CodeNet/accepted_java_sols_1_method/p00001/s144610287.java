import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++) {
            list.add(sc.nextInt());
        }
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
