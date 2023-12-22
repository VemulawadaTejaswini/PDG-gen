import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int goh = X / 500;
        X -= (goh*500);
        int go = X / 5;
        System.out.println(goh * 1000 + go*5);
    }

}
