import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        int time = t;
        while(x < n){
            n -= x;
            time += t;
        }
        System.out.println(time);
    }
}