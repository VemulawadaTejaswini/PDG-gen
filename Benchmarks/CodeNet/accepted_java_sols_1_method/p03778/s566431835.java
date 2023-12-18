import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int dist = 0;
        if(a+W < b){
            dist = b - (a+W);
        } else if(b+W < a){
            dist = a - (b+W);
        } else {
            dist = 0;
        }
        System.out.print(dist);
    }
}