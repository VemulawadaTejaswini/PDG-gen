import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ac = 0,wa=0,tle=0,re=0;
        while(n-->0){
            String cases = in.next();
            if(cases.equals("AC"))
                ac++;
            else if(cases.equals("WA"))
                wa++;
            else if(cases.equals("TLE"))
                tle++;
            else if(cases.equals("RE"))
                re++;
        }

        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
        in.close();
    }
}