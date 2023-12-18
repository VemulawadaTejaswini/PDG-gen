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


        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i; j < n; j++) {
                if (inputs[j] < inputs[minj]) {
                    minj = j;
                }
            }
            if (minj != i) {
                int tmp = inputs[minj];
                inputs[minj] = inputs[i];
                inputs[i] = tmp;
                cnt++;
            }
        }
        printArr(inputs);
        System.out.println(cnt);
    }

}
