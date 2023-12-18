import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.nextLine();
        List<Integer> array = new ArrayList<>();
        for(int i=0; i<givenNumber; i++) {
            array.add(scanner.nextInt());
        }
        Set<Integer> newArray = new HashSet<Integer>(array);
        System.out.println(newArray.size());
    }
}
