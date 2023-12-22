import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counter = new int[4];
        int N = sc.nextInt();
        for (int i = 0; i < N ; i++) {
            String s = sc.next();
            if(s.equals("AC")){
                counter[0] = ++counter[0];
            }else if(s.equals("WA")){
                counter[1] = ++counter[1];
            }else if(s.equals("TLE")){
                counter[2] = ++counter[2];
            }else if(s.equals("RE")){
                counter[3] = ++counter[3];
            }
        }
        System.out.println("AC x " + counter[0]);
        System.out.println("WA x " + counter[1]);
        System.out.println("TLE x " + counter[2]);
        System.out.println("RE x " + counter[3]);
    }
}