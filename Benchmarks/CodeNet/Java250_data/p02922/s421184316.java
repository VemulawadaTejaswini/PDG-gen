import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int so = 1;
        sc.nextLine();
        int count = 0;
        while(so < b){
            so += a - 1;
            count++;
        }
        System.out.println(count);
    }
}