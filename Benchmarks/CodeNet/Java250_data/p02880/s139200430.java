import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        boolean b = false;
        if(n == 1 || (n % 2 == 0 && n <= 18) || (n % 3 == 0 && n <= 27) || (n % 4 == 0 && n <= 36) || (n % 5 == 0 && n <= 45) || (n % 6 == 0 && n <= 54) || (n % 7 == 0 && n <= 63) || (n % 8 == 0 && n <= 72) || (n % 9 == 0 && n <= 81)){
            b = true;
        }
        if(b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}