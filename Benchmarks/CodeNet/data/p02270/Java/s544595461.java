import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,k;
        int sum = 0;
        n = sc.nextInt(); k = sc.nextInt();
        for(int i = 0; i < n; i++){
            sum += sc.nextInt();    
        }
        sum = sum%k==0? sum/k:sum/k + 1;
        System.out.println(sum);
    }
}