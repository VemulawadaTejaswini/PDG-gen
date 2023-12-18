import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        int x = sc.nextInt();
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println(x);
            return;
    }
        ArrayList<Integer> p = new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            p.add(sc.nextInt());
        }

        Integer t = Integer.valueOf(0);
        for(int i = 0; ;i++) {
            t = Integer.valueOf(x - i);
            if(!p.contains(t)) {
                System.out.println(t.toString());
                return;
            } 
            t = Integer.valueOf(x + i);
            if(!p.contains(t)) {
                System.out.println(t.toString());
                return;
            } 
        }
    }
}
