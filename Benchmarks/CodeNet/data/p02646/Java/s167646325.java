import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();

        long diff = b-a;
        long c = v-w;

        for(int i=1; i<=t; i++){
            diff = diff - c;
            if(diff==0) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}