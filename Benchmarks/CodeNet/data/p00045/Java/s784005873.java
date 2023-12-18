import java.util.Scanner;
 
public class Main {
    static Scanner stdin = new Scanner(System.in);
    public static void main(String args[]) {
        int sumMoney = 0;
        int count = 0;
        double sumStock = 0;
        while(stdin.hasNext()) {
            count++;
            Scanner s = new Scanner(stdin.next().replaceAll(",", " "));
            int a = s.nextInt(), b = s.nextInt();
            sumMoney += a * b;
            sumStock += b;
        }
        System.out.println(sumMoney);
        System.out.println((int)((sumStock / count) + 0.5));
    }
}