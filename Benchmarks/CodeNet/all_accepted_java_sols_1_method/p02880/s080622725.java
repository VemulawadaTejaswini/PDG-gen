import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        boolean a = true;
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                if(n == i * j){
                    System.out.println("Yes");
                    a = false;
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}