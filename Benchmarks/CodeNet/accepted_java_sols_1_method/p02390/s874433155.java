import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        
        int h = s/3600;
        s -= h*3600;
        
        int m = s/60;
        s -= m*60;
        
        System.out.println(h+":"+m+":"+s);
    }
}
