import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ac = 0,wa = 0,tle = 0,re = 0;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String next = sc.next();
            if(next.equals("AC")){
                ac++;
            }else if(next.equals("WA")){
                wa++;
            }else if(next.equals("TLE")){
                tle++;
            }else if(next.equals("RE")){
                re++;
            }
        }
        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
    }
}
