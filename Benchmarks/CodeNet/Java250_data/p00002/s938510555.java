import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            String z = String.valueOf(x + y);
            System.out.println(z.length());
        }
    }
}