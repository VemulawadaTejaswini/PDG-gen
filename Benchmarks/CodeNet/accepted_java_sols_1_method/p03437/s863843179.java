import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        sc.close();
        boolean ebishu = true;
        for(int i = 1 ; i <= 3 && ebishu ; i++){
            if((x * i) % y != 0){
                System.out.println(i * x);
                ebishu = false;
            }
        }
        if(ebishu){
            System.out.println(-1);
        }
    }
}