import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = new int[4];
        while (t-- > 0) {
            String s = sc.next();
            if (s.equals("AC")) {
                arr[0]++;
            } else if (s.equals("WA")) {
                arr[1]++;
            } else if (s.equals("TLE")) {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }
        
        System.out.println("AC x " + arr[0]);
        System.out.println("WA x " + arr[1]);
        System.out.println("TLE x " + arr[2]);
        System.out.println("RE x " + arr[3]);
 
    }
}