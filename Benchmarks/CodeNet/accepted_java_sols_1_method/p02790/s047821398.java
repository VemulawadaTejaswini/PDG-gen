import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a <= b){
            for(int i = 0; i < b; i++){
                System.out.print(a);
            }
        }else if(a > b){
            for(int i = 0; i < a; i++){
                System.out.print(b);
            }
        }
    }
}