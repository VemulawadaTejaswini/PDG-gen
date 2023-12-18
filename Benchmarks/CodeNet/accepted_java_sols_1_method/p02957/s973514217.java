import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = Math.abs(a-b);
        if(diff % 2 == 0){
            System.out.println(Math.min(a,b) + diff/2);
        }else{
            System.out.println("IMPOSSIBLE");
        }
        sc.close();

    }

}
