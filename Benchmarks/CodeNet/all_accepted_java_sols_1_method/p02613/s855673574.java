import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] result = {0,0,0,0};
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String s = sc.next();
            switch (s) {
                case "AC":
                    result[0]++;
                    break;
                case "WA":
                    result[1]++;
                    break;
                case "TLE":
                    result[2]++;
                    break;
                default:
                    result[3]++;
                    break;
            }
        }
        System.out.println("AC x "+result[0]);
        System.out.println("WA x "+result[1]);
        System.out.println("TLE x "+result[2]);
        System.out.println("RE x "+result[3]);

    }
}
