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
        for(int i = 0; i <= x; i++){
            int a = i;
            int b = x - i;
            if(a * 2 + b * 4 == y){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        scan.close();
    }
}