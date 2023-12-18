import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        n = n % 1000;
        if(n == 0){
            System.out.println(n);
        }else {
            System.out.println(1000 - n);
        }
    }
}
