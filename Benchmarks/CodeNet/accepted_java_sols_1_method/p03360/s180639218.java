import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int largest = 0;
        int index = 0;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
            if (num[i] > largest) {
                largest = num[i];
                index = i;
            }
        }
        int k = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            if (i == index) {
                sum += num[i]* Math.pow(2, k);
            } else {
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}