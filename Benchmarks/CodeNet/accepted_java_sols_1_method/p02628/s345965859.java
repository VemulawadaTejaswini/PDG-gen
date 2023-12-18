import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int answer = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
        Arrays.sort(array);
        for (int i = 0; i < k; i++)
            answer += array[i];
        System.out.println(answer);
    }
}
