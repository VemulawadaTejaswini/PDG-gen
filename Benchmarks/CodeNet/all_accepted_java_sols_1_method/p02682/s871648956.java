import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        int max = 0;

        if(a < k){
            max += a*1;
            if(b <= k-a){
                max += b*0;
                if(c <= k - a - b){
                    max += c*(-1);
                }else{
                    max += (k - a - b)*(-1);
                }
            }else if(b > k-a){
                max += (k-a)*b;
            }
        }else{
            max += k*1;
        }

        System.out.println(max);
    }
}