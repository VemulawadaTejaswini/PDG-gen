import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        long at = 0;
        for (int i=0;i<n;i++)at+=sc.nextInt();
        if (h<=at)System.out.println("Yes");
        else System.out.println("No");
    }
}
