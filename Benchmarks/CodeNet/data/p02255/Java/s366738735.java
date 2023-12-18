import java.util.Scanner;

public class Main {
    public static void printArr(int[] arr) {
        String[] ss = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ss[i] = String.valueOf(arr[i]);
        }
        System.out.println(String.join(" ", ss));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextInt();
        }
        printArr(inputs);
        for (int i = 1; i < n; i++) {
            int v = inputs[i];
            int j = i - 1;
            while(j >= 0 && inputs[j] > v) {
                inputs[j + 1] = inputs[j];
                j--;
            }
            inputs[j + 1] = v;
            printArr(inputs);
        }

    }

}
