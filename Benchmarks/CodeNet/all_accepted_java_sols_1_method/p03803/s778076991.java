
import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a == b){
            System.out.println("Draw");
        }else if(a == 1 || (a > b && b != 1)){
            System.out.println("Alice");
        }else{
            System.out.println("Bob");
        }





    } // mainMethod



} // MainClass
