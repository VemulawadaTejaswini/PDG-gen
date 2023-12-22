import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        if(-40 <= X && X <= 40){
            //処理
            if(X >= 30) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            
        }else{
            System.out.println("Invalid value");
        }
    }
}
