import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[2];
        for(int i=0; i < a; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            if(s1.compareTo(s2) > 0) {
                b[0] += 3;
            }
            else if(s1.compareTo(s2) < 0) {
                b[1] += 3;
            }
            else {
                b[0]++;
                b[1]++;
            }
        }
        System.out.println(b[0] + " " + b[1]);
    }
}
