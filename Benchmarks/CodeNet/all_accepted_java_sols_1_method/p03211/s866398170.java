import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                sc.close();
                int[] a = new int[3];
                int pct = 100000;
                for(int i = 0 ; i < s.length() - 2 ; i++){
                        a[0] = (int)s.charAt(i) - 48;
                        a[1] = (int)s.charAt(i + 1) - 48;
                        a[2] = (int)s.charAt(i + 2) - 48;
                        int yono = 100 * a[0] + 10 * a[1] + a[2];
                        pct = Math.min(pct , Math.abs(yono - 753));
                }
                System.out.println(pct);
        }
}//0=48
//鶏になれ