import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int count = 0;
        for(int i=0; i<=a; i++) {
            if(i*500+b*100+c*50 < x) continue;
            for(int j=0; j<=b; j++) {
                if(i*500+j*100+c*50 < x) continue;
                for(int k=0; k<=c; k++) {
                    if(i*500+j*100+k*50 == x) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }  
}