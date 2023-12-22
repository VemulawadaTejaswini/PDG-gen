import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] count = new int[4];

        for (int i = 0; i < N; i++ ){
            String ip = sc.next();
            if (ip.equals("AC")) {
                count[0]++;
            } else if (ip.equals("WA")) {
                count[1]++;
            } else if (ip.equals("TLE")) {
                count[2]++;
            } else if (ip.equals("RE")) {
                count[3]++;
            }
        }
      
        sc.close();

        System.out.println("AC x " + count[0]);
        System.out.println("WA x " + count[1]);
        System.out.println("TLE x " + count[2]);
        System.out.println("RE x " + count[3]);
    }
}
