import java.util.*;

public class Main
{
    public static void main(String... args)
    {
        final Scanner lineScanner = new Scanner(System.in);
        final Scanner scanner = new Scanner(lineScanner.nextLine());
        final List<Integer> integers = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            integers.add(scanner.nextInt());
        }
        Collections.sort(integers);
        System.out.println(integers.toString().replaceAll("[^0-9]+", " ").trim());
    }
}