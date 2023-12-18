import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        if(n % 1000 == 0){
            System.out.println(0);
        }else{
            System.out.println(1000 - n % 1000);
        }
    }
}
