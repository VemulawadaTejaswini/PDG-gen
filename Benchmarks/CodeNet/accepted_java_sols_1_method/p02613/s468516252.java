import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int A=0,W=0,T=0,R=0;
        String AC = new String("AC");
        String WA = new String("WA");
        String TLE = new String("TLE");
        String RE = new String("RE");
        Scanner scan = new Scanner(System.in);
        String txt = new String();
        int N = scan.nextInt();
        for(int i = 0;i < N;i++){
            txt = scan.next();
            if(txt.equals(AC)){
                A++;
            }else if(txt.equals(WA)){
                W++;
            }else if(txt.equals(TLE)){
                T++;
            }else if(txt.equals(RE)){
                R++;
            }
        }
        scan.close();
        System.out.println("AC x " + A);
        System.out.println("WA x " + W);
        System.out.println("TLE x " + T);
        System.out.println("RE x " + R);
    }
}