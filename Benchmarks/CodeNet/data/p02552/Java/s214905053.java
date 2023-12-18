import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int x = stdIn.nextInt();
        
        if(x == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}