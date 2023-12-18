import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long cnt = 0;
        cnt = (B/C) - (A/C);
        if(A%C == 0) cnt++;
        System.out.println(cnt);
    }
}