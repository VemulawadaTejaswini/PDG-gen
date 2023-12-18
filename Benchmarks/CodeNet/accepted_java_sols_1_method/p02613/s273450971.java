import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[4];
        for(int i = 0; i < N; i++) {
            String tmp = sc.next();
            if(tmp.equals("AC")) {
                arr[0]++;
            } else if(tmp.equals("WA")){
                arr[1]++;
            } else if(tmp.equals("TLE")) {
                arr[2]++;
            } else if(tmp.equals("RE")) {
                arr[3]++;
            }
        }
            System.out.println("AC x " + arr[0]);
            System.out.println("WA x " + arr[1]);
            System.out.println("TLE x " + arr[2]);
            System.out.println("RE x " + arr[3]);
    }
}
