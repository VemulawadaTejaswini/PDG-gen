import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        List <Integer> list = Arrays.asList(1,2,3);

        list.stream().filter(l -> !l.equals(A) && !l.equals(B)).forEach(System.out::println);
    }
}
