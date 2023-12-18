import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static int num;
    private static int[] data;

    public static void main(String[] args) {
        dataSet();

        int min = arrayMin(num, data);
        int max = arrayMax(num, data);
        int sum = arraySum(num, data);

        System.out.println(min + " " + max + " " + sum);
    }

    static void dataSet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String numString = reader.readLine();
            String[] dataString = reader.readLine().split(" ");

            num = Integer.parseInt(numString);

            for (int i = 0; i < num; i++) {
                data[i] = Integer.parseInt(dataString[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static int arrayMin(int num, int[] data) {
        int min = -1;
        for (int i = 0; i < num - 1; i++) {
            min = Math.min(data[i], data[i + 1]);
        }
        return min;
    }

    static int arrayMax(int num, int[] data) {
        int max = -1;
        for (int i = 0; i < num - 1; i++) {
            max = Math.max(data[i], data[i + 1]);
        }
        return max;
    }

    static int arraySum(int num, int[] data) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += data[i];
        }
        return sum;
    }
}