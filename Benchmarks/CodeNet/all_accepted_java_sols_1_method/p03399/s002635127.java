import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int min1 = sc.nextInt();
        min1 = Math.min(min1, sc.nextInt());

        int min2 = sc.nextInt();
        min2 = Math.min(min2, sc.nextInt());

        System.out.println(min1 + min2);
    } 
}