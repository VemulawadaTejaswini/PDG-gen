import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();

        int morning = h1 * 60 + m1;
        int evening = h2 * 60 + m2;
        int during = evening - morning;
        int answerTime = during - k;
        
        System.out.println(answerTime);
    }
}