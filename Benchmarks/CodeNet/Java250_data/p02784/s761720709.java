import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += scan.nextInt();
        }
        System.out.println(h <= sum ? "Yes" : "No");
    }
}