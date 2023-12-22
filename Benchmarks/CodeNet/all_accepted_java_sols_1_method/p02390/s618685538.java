import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int h, m, s, ss;
        h = 0;
        m = 0;
        s = 0;
        Scanner scan = new Scanner(System.in);
        ss  = scan.nextInt();
        if(ss >= 60){
            m = ss / 60;
            s = ss % 60;
            if(m >= 60){
                h = m / 60;
                m = m % 60;
            }
        }
        System.out.println(h +":"+ m +":"+ s);
    }
}
