import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Integer.parseInt(s.substring(0, 1));
        int b = Integer.parseInt(s.substring(1, 2));
        int c = Integer.parseInt(s.substring(2, 3));
        int d = Integer.parseInt(s.substring(3, 4));
        String aSign = "";
        String bSign = "";
        String cSign = "";
        for(int i=0; i<Math.pow(2, 3); i++) {
            for(int j=0; j<2; j++) {
                if(j == 0) aSign = "+";
                else aSign = "-";
               for(int k=0; k<2; k++) {
                   if(k == 0) bSign = "+";
                   else bSign = "-";
                   for(int l=0; l<2; l++) {
                       int total = 0;
                       if(l == 0) cSign = "+";
                       else cSign = "-";
                       if("+".equals(aSign)) {
                           total = a + b;
                       }
                       else {
                           total = a - b;
                       }
                       if("+".equals(bSign)) {
                           total += c;
                       }
                       else {
                           total -= c;
                       }
                       if("+".equals(cSign)) {
                           total += d;
                       }
                       else {
                           total -= d;
                       }
                       if(total == 7) {
                           String ans = Integer.toString(a)
                                   + aSign
                                   + Integer.toString(b)
                                   + bSign
                                   + Integer.toString(c)
                                   + cSign
                                   + Integer.toString(d)
                                   + "=7";
                           System.out.println(ans);
                           return;
                       }
                   }
               }
            }
        }
    }
}