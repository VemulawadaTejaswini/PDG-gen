import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int now = 1;
        int count = 0;
        while (now < B) {
        	count++;
        	now += A - 1;
        }
        System.out.println(count);
    }
}