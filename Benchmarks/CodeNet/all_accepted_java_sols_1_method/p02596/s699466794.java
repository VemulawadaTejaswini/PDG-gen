import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        long s = 7;
        boolean ebishu = true;
        for(int i = 0 ; i < k + 1 && ebishu ; i++){
            if(i != 0){
                s = 10 * s + 7;
            }
            s = s % k;
            if(s == 0){
                System.out.println(i + 1);
                ebishu = false;
            }
        }
        if(ebishu){
            System.out.println(-1);
        }
    }
}