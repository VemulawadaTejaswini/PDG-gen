import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min = a;
        int min2 = c;

        if(b<min){
            min = b;
        }
        if(d<min2){
            min2 = d;
        }
        System.out.println(min+min2);

    }
}