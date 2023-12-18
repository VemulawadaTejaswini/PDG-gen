import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i]= sc.nextInt();
        }
        for(int j = 0; j < n; j++){
            System.out.print(a[n - 1 - j]);
            if(j != n - 1){
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        sc.close();
    }
}
