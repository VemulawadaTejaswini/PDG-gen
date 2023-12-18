import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        Arrays.sort(numbers);
        
        System.out.println(numbers[0] + " " + numbers[n - 1] + " " + sum);
    }
}
