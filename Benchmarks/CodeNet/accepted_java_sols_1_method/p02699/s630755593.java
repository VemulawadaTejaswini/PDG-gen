import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 0, m = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        if(n <= m){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
    }
}