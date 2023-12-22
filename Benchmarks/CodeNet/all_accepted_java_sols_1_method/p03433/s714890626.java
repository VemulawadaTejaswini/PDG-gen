import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a % 500 <= b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }



}


