import java.util.Arrays;
 
public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);
 
    public static void main(String[] args) {
        int n = scanner.nextInt(), a[] = new int[n], sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i] = scanner.nextInt();
        if (sum % 10 == 0)
            sum -= Arrays.stream(a)
                    .filter(i -> i % 10 != 0)
                    .min()
                    .orElse(0);
        System.out.println(sum % 10 == 0 ? 0 : sum);
    }
}