import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] list = new int[9];
        start:for(int i=0;i<n;i++){
            int s = Integer.parseInt(sc.next());
            int rate = s/400;
            if(rate<8) list[rate]++;
            else list[8]++;
        }
        int aans = 0;
        int bans = 0;
        for(int i=0;i<8;i++){
            if(list[i]>0) aans++; 
        }
        bans = aans+list[8];
        if(aans == 0) {aans=1;}
        System.out.println(aans + " " + bans);
        
    }
}