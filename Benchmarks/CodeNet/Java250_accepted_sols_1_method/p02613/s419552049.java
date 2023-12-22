import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int acnum = 0, wanum = 0, tlenum = 0, renum = 0;
        String judge = "";
        for(long i = 0; i < n + 1; i++){
            judge = sc.nextLine();
            switch(judge){
                case "AC":
                    acnum++;
                    break;
                case "WA":
                    wanum++;
                    break;
                case "TLE":
                    tlenum++;
                    break;
                case "RE":
                    renum++;
                    break;
                default:
                    break;
            }
        }
        sc.close();

        System.out.println("AC x " + acnum);
        System.out.println("WA x " + wanum);
        System.out.println("TLE x " + tlenum);
        System.out.println("RE x " + renum);
    }
}
