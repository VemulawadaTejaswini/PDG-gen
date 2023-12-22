import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int pickCount = sc.nextInt();
        int[] numbers = new int[total];
        int result = 0;
        for(int i = 0 ; i < total ; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        for(int i = 0; i < pickCount ; i++){
            result += numbers[i];
        }
        System.out.println(result);
    }
}
