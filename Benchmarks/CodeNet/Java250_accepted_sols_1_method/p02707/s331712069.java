import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        int[] boss = new int[numberOfPerson];
        for (int i = 0; i < boss.length - 1; i++){
            boss[scanner.nextInt() - 1]++;
        }
        for (int i : boss){
            System.out.println(i);
        }

        /*
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        List<String> boss = Arrays.asList(scanner.nextLine().split(" "));
        Map<String, Integer> map = boss.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.summingInt(s -> 1)
                )
        );
        for (int i = 1; i < numberOfPerson + 1; i++){
            if (map.containsKey(String.valueOf(i))) {
                System.out.println(map.get(String.valueOf(i)));
            }else {
                System.out.println(0);
            }
        }



        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

         */
    }
}
