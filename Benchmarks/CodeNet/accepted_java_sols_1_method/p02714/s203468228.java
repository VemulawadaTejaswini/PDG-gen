import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String s = sc.next();
                long[] q = new long[3];
                for(int i = 0 ; i < n ; i++){
                        if(s.charAt(i) == 'R') q[0]++;
                        else if(s.charAt(i) == 'G') q[1]++;
                        else q[2]++;
                }
                sc.close();
                long yono = q[0] * q[1] * q[2];
                for(int i = 0 ; i < n - 2 ; i++){
                        for(int j = i + 1 ; j <= n - 2 ; j++){
                                if(2 * j - i < n && s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(2 * j - i) && s.charAt(2 * j - i) != s.charAt(i)) yono--;
                        }
                }
                System.out.println(yono);
        }
}