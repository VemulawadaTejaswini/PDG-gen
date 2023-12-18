import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        scanner.nextLine();
        List<Double> values = new ArrayList<Double>();
        String[] valueString = scanner.nextLine().split(" ");
        Stream<String> stream = Arrays.stream(valueString);
        values = stream.map(v -> Double.parseDouble(v)).collect(Collectors.toList());
        Collections.sort(values);
        Double ans = values.stream().reduce((val, elm) -> (val + elm)/2).orElse(0.0);
        System.out.println(ans);        
    }
}