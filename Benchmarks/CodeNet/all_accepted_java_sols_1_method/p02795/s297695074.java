import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.nextLine());
        int w = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int large;
        int small;
        // 合計
        int total = 0;
        int paint = 0;
        if(h >= w){
            large = h;
            small = w;
        }else {
            large = w;
            small = w;
        }
        
        while(total < n){
            total = total + large;
            paint++;
        }
        System.out.println(paint);
    }
    
}