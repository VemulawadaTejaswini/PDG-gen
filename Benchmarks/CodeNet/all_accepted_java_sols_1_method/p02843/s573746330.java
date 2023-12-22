import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean ebishu = true;
        int i = 0;
        while(ebishu){
            n -= 100;
            i += 5;
            if(n >= 0 && n <= i){
                ebishu = false;
                System.out.println(1);
            }else if(n < 0){
                ebishu = false;
                System.out.println(0);
            }
        }
    }
}