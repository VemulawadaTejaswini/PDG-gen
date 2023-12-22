import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if((a + b) % 2 != 0){
            System.out.println("IMPOSSIBLE");
            System.exit(0);
        }else{
            System.out.println((a + b) / 2);
        }
    }
}