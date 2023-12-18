import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        if(n % 2 == 0){
            System.out.println(n / 2);
        }else{
            System.out.println(n / 2 + 1);
        }
    }
}