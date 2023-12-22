import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> array = new ArrayList<>();
        array.add(String.valueOf(s.charAt(0)));
        array.add(String.valueOf(s.charAt(1)));
        array.add(String.valueOf(s.charAt(2)));
        array.add(String.valueOf(s.charAt(3)));
        Collections.sort(array);
        if (array.get(0).equals(array.get(1)) && !array.get(1).equals(array.get(2)) && array.get(2).equals(array.get(3))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}