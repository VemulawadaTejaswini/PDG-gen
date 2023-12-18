import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int x = stdIn.nextInt();

        if(x >= 30){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}