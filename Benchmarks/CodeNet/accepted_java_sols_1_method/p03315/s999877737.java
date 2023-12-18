import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp = s.split("");
        int n = 0;
        for(int i=0; i<4; i++) {
            if(sp[i].equals("+")) n++;
            else n--;
        }
        System.out.println(n);
    }
}
