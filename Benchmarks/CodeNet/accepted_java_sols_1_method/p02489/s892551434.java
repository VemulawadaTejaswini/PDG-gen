import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1;
        while(x!=0){
            System.out.println("Case "+n+": "+x);
            x = sc.nextInt();
            n++;
        }
    }
}