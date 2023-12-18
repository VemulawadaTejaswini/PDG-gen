import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(y % 2 != 0){
            System.out.println("No");
            return;
        }
        if(2 * x < y && y > 4 * x){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        scan.close();
    }
}