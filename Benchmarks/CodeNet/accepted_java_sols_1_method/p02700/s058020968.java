import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hpA = sc.nextInt();
        int atkA = sc.nextInt();
        int hpB = sc.nextInt();
        int atkB = sc.nextInt();

        boolean turn = true;
        while(turn){
            hpB -= atkA;
            if(hpB <= 0) break;
            hpA -= atkB;
            if(hpA <= 0) break;
        }
        if(hpA > hpB){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}