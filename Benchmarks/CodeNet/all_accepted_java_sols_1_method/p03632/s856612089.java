import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a < c){
            a = c;
        }
        if(b > d){
            b = d;
        }
        if(b < a){
            System.out.println(0);
        }else{
            System.out.println(b - a);
        }
    }
}