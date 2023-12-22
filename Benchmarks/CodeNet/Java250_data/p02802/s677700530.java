import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int numberOfSubmissions = scanner.nextInt();

        int failsCounter = 0;
        int successCounter = 0;

        Map<Integer, Integer> fails = new HashMap<>();
        Map<Integer, String> tasks = new HashMap<>();

        for (int i = 0; i < numberOfSubmissions; i++) {
            int task = scanner.nextInt();
            String submissionStatus = scanner.next();


            if (!tasks.containsKey(task)) {
                tasks.put(task, submissionStatus);
                if (submissionStatus.equals("AC")) {
                    successCounter++;
                } else {
                    fails.put(task, 1);
                }
            } else {
                String currentStatus = tasks.get(task);

                if (currentStatus.equals("WA")) {
                    if (submissionStatus.equals("AC")) {
                        failsCounter += fails.get(task);
                        successCounter++;
                        tasks.put(task, submissionStatus);
                    } else {
                        int currentFails = fails.get(task);
                        fails.put(task, ++currentFails);
                    }
                }
            }

        }
        System.out.println(successCounter + " " + failsCounter);
    }
}
