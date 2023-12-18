import java.util.*;

public class Main{
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x, y;
        for(int i = 0;i<n;i++){
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            if(d >= Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) count++;
        }
        System.out.println(count);
    }
}