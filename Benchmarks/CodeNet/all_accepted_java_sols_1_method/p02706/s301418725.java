import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long totalTime=scan.nextLong();
        long n=scan.nextLong();
        for (long i = 0; i <n ; i++) {
            totalTime-=scan.nextLong();
        }
        System.out.println(Math.max(totalTime,-1));
    }
}
