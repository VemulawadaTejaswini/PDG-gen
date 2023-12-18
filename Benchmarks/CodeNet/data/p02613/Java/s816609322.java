import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] result = {0,0,0,0};
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String s = sc.next();
            if(s.equals("AC")) result[0]++;
            else if (s.equals("WA")) result[1]++;
            else if (s.equals("TLE")) result[2]++;
            else result[3]++;
        }
        System.out.println("AC x "+result[0]);
        System.out.println("WC x "+result[1]);
        System.out.println("TLE x "+result[2]);
        System.out.println("RE x "+result[3]);
        
    }
}
