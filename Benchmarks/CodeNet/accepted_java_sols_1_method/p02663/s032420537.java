import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wake = 60 * sc.nextInt() + sc.nextInt();
        int sleep = 60 * sc.nextInt() + sc.nextInt();
        int M = sc.nextInt();
        int awaking = wake < sleep ? sleep - wake : 3600 - wake + sleep;
        System.out.println(awaking - M);
    }
}