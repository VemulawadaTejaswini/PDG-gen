import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        int vote = 0;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            vote += a[i];
        }
        for(int i = 0; i < n; i++){
            if(a[i] >= (double)vote/(4*m)){sum++;}
        }
        if(sum >= m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        return;
    }
}