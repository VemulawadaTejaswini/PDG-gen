import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String topping = sc.next();
        System.out.println(700 + Arrays.stream(topping.split("")).filter(t -> t.equals("o")).count()*100);
    }
}
