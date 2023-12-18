import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int a = 0,t = 0,w = 0,r = 0;
        while(n-->0){
            String str = s.next();

            switch (str) {
                case "AC":
                    a++;
                    break;
                case "RE":
                    r++;
                    break;
                case "TLE":
                    t++;
                    break;
                case "WA":
                    w++;
                    break;
            }
        }
        System.out.println("AC x "+a);
        System.out.println("WA x "+w);
        System.out.println("TLE x "+t);
        System.out.println("RE x "+r);
    }
}
