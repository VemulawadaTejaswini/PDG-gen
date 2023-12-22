import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sec = sc.nextInt();
    int num = sc.nextInt();
    double maxSec = sc.nextInt();
    sc.close();
    maxSec += 0.5;
    double mult = maxSec / sec;
    System.out.println((int)mult * num);
    }
}