import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int out = a - b * 2;
        if(out <= 0){
            System.out.println("0");
        }else{
            System.out.println(out);
        }
    }
}