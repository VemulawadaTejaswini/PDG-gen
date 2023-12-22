import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int k = scan.nextInt();
        int x = scan.nextInt();
        for(int i = 1; i < 2 * Math.abs(k); i++){
            System.out.print(x - k + i + " ");
        }
    }
}