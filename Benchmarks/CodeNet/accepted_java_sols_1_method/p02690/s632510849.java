import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        for(long a = -1500; a <= 1500; a++) {
            for(long b = -1500; b <= 1500; b++) {
                if(((long)(Math.pow(a, 5) - Math.pow(b, 5))) == x) {
                    System.out.println(a + " " + b);
                    b = 100000;
                    a = 100000;
                }
            }
        }
    }
}
