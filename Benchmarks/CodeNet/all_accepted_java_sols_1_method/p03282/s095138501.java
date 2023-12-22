import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        k = Math.min(k , (long) 100);
        sc.close();
        int n = -1;
        while(k > 0){
            n++;
            k--;
            if(s.charAt(n) != '1'){
                k = -2;
                System.out.println(s.charAt(n));
            }else{
            }
        }
        if(k != -2){
            System.out.println(1);
        }
    }
}