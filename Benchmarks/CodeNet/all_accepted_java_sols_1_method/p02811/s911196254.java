import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt() * 500;
        int x = scan.nextInt();
        System.out.println(k >= x ? "Yes" : "No");
        scan.close();
    }
}