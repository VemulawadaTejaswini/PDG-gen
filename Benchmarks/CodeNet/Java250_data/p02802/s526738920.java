import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valArr = sc.nextLine().split(" ");
        long n = Long.parseLong(valArr[0]);
        long m = Long.parseLong(valArr[1]);
        long acCount = 0;
        long waCount = 0;

        if (m == 0) {
            sc.close();
            System.out.println("0 0");
        } else {
            Map<Long, Boolean> resultMap = new HashMap<>();
            Map<Long, Long> waCountMap = new HashMap<>();
            for (long i = 1; i <= n; i++) {
                resultMap.put(i, false);
                waCountMap.put(i, 0L);
            }

            while (sc.hasNext()) {
                String apply = sc.nextLine();
                Long problemNo = Long.parseLong(apply.split(" ")[0]);
                String result = apply.split(" ")[1];
                boolean registedResult = resultMap.get(problemNo);
                if (registedResult) {
                    continue;
                }
                if (result.equals("AC")) {
                    acCount++;
                    resultMap.put(problemNo, true);

                } else {
                    long divWaCount = waCountMap.get(problemNo);
                    divWaCount++;
                    waCountMap.put(problemNo, divWaCount);
                }
            }

            sc.close();

            for (long i = 1; i <= n; i++) {
                boolean finalResult = resultMap.get(i);
                if (finalResult) {
                    waCount = waCount + waCountMap.get(i);
                }
            }

            System.out.println(acCount + " " + waCount);
        }
    }

}