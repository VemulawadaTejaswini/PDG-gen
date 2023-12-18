import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        int n = a;
        while(n > 0){
            sum = sum + (n%10);
            n = (n - (n % 10)) / 10;
        }

        if(a % sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
