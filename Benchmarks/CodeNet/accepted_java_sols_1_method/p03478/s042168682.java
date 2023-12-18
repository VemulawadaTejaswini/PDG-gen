import java.util.Scanner;
// ABC 083
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sums = 0;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int j = i;
            while(j > 0) {
                sum += j % 10;
                j /= 10;
            }
            if(a <= sum && sum<= b) sums += i;
        }
        
        System.out.println(sums);
    }
}