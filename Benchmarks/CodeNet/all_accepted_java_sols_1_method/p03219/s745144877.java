import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] agrs){
        int a, b;
        int ans;
        while(sc.hasNext()){
            ans = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            ans = a + (b)/2;
            System.out.println(ans);
        }
    }
}
