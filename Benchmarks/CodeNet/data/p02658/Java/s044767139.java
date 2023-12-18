import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long total = 1;
        for(int i =0; i<a; i++) {
            total *= sc.nextLong();
        }
        long c = (long) Math.pow(10, 18);
        if(c < total) System.out.println("-1");
        else System.out.println(total);
    }
}