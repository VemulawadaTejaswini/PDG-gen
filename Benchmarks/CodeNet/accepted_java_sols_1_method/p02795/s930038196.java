import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(Math.min((n-1)/h+1, (n-1)/w+1));
 
    }



}