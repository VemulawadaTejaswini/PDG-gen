import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int paramN = Integer.parseInt(scanner.nextLine());
        String[] paramsV = scanner.nextLine().split(" ");
        scanner.close();
        
        int[] values = new int[paramsV.length];

        for (int i = 0; i < paramsV.length; i++) {
            values[i] = Integer.parseInt(paramsV[i]);
        }

        Arrays.sort(values);

        double currentValue = values[0];

        for (int i = 0; i < values.length - 1; i++) {
            currentValue = (currentValue + (double)values[i + 1]) / (double)2;
        }

        System.out.println(currentValue);
    }
}