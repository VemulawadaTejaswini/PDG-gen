import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n==0 && x==0){
                break;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = i+1; j <= n; j++) {
                    for (int k = j+1; k <= n; k++) {
                        sum=0;
                        if (i == j || i == k || j == k) {
                            
                        } else {
                            sum = i + j + k;
                           
                            if (sum == x){
                                count++;
                            }
                            
                        }
                    }
                }
            }
            System.out.printf("%d\n",count);
            count=0;
        }
        sc.close();
    }
}
