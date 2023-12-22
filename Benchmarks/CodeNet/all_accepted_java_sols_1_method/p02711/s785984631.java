import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();

        if(a == 7){
            System.out.println("Yes");
            return;
        }

        while(a/10 >0){
            if(a%10 == 7){
                System.out.println("Yes");
                return;
            }
            a/= 10 ;
            if(a%10 == 7){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}