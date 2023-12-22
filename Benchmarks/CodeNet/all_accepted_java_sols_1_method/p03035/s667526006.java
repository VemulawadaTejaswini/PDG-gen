import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //int cost = num2;
        if(num1 <= 12){
            num2 /= 2;
        }
        if(num1 <= 5){
            num2 = 0;
        }
        System.out.println(num2);
        scan.close();
    }
}