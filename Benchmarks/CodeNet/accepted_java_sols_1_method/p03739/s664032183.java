import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> a.add(sc.nextLong()));


        Long plusMinusStep = 0L;
        Long minusPlusStep = 0L;
        Long plusMinusSum = 0L;
        Long minusPlusSum = 0L;
        for (int i = 0; i < n; i++) {
            Long target = a.get(i);
            if (i % 2 == 1) {
                if (plusMinusSum + target >= 0) {
                    plusMinusStep += Math.abs(plusMinusSum + target) + 1;
                    plusMinusSum = -1L;
                } else {
                    plusMinusSum += target;
                }
                if (minusPlusSum + target <= 0) {
                    minusPlusStep += Math.abs(minusPlusSum + target) + 1;
                    minusPlusSum = 1L;
                } else {
                    minusPlusSum += target;
                }
                continue;
            }
            if (plusMinusSum + target <= 0) {
                plusMinusStep += Math.abs(plusMinusSum + target) + 1;
                plusMinusSum = 1L;
            } else {
                plusMinusSum += target;
            }
            if (minusPlusSum + target >= 0) {
                minusPlusStep += Math.abs(minusPlusSum + target) + 1;
                minusPlusSum = -1L;
            } else {
                minusPlusSum += target;
            }
        }
        System.out.println(Math.min(plusMinusStep, minusPlusStep));
    }

}
