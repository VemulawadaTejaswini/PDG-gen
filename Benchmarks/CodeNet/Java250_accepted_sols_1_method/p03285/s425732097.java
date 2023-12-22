import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if(n%4 == 0 || n%7 == 0){
            flag = 1;
        }
        while(n >= 0){
            n = n-4;
            if(n % 7 == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}