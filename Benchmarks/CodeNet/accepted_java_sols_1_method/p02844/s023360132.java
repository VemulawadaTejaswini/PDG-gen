import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int c = 0;
        for(int i=0; i<1000; i++) {
            String temp = Integer.toString(i);
            int len = temp.length();
            if(len < 3) {
                temp = (len==1 ? "00" : "0") + temp;
            }
            char t1 = temp.charAt(0);
            char t2 = temp.charAt(1);
            char t3 = temp.charAt(2);
            int i1 = s.indexOf(t1, 0);
            if(i1<0) {
                continue;
            }
            int i2 = s.indexOf(t2, i1+1);
            if(i2<0) {
                continue;
            }
            if(s.indexOf(t3, i2+1)>0) {
                c++;
            }
        }

        System.out.println(c);
    }
}
