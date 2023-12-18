import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                max = (inputs[j] - inputs[i]) > max ? (inputs[j] - inputs[i]) : max;
//            }
//        }
        int min = inputs[0];
        for(int i = 1; i < n; i++) {
            max = (inputs[i] - min) > max ? (inputs[i] - min) : max;
            min = inputs[i] < min ? inputs[i] : min;
        }
        System.out.println(max);
    }

}
