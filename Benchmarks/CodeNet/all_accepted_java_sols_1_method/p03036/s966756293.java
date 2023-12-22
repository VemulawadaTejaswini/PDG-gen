import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        int ans = x;
        for(int i=0;i<10;i++){
            ans = (r * ans)-D;
            System.out.println(ans);
        }
    }
}