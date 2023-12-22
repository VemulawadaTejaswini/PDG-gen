import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/500;
        int c=a%500;
        int d=c/5;
        System.out.println(b*1000+d*5);
    }
}