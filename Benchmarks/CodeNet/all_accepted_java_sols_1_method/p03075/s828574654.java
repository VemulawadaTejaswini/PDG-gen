import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0; i<5; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int k = Integer.parseInt(sc.next());
        
        String ans = "Yay!";
        for(int i=0; i<4; i++) {
            for(int j=i+1; j<5; j++) {
                if(a[j]-a[i] > k) {
                    ans = ":(";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}