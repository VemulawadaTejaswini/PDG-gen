
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ac=0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        for (int i=0;i<=N;i++){
            String a = scan.nextLine();
            switch(a){
                case "AC":
                    ac++;
                    break;
                case "WA":
                    wa++;
                    break;
                case "TLE":
                    tle++;
                    break;
                case "RE":
                    re++;
                    break;
            }
        }

        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);
    }
}
