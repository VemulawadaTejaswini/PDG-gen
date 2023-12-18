import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int rect1,rect2 = 0;
        rect1 = a * b;
        rect2 = c * d;
        if(rect1 >= rect2){
            System.out.println(rect1);
        }else{
            System.out.println(rect2);
        }
    }
}