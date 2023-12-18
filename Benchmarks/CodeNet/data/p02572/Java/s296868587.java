import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int numberOfRecords = sc.nextInt();
        List<Integer> values = new ArrayList<>();
        while (numberOfRecords > 0) {
            values.add(sc.nextInt());
            numberOfRecords--;
        }
        int sum = 0;
        for (int i = 0; i < numberOfRecords; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += values.get(i) * values.get(j);
            }
        }
        System.out.print(sum);
    }
}