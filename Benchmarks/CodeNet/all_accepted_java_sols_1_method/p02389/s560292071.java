import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int S = num1*num2;
        int L = 2*(num1+num2);
        System.out.println(S+" "+L);
        scan.close();
    }
}
