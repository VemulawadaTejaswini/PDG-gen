import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();int c = sc.nextInt();
     int ans = 0;
     int temp = a - b;
     ans = c - temp;
     if(ans <= 0){
         System.out.println(0);
     }
     else{System.out.println(ans);}
    }
}