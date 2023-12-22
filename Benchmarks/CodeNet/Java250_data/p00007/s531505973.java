import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount=100000;
        for(int i=0;i<n;i++) {
            amount*=1.05;
            amount=amount%1000>0?(amount/1000+1)*1000:amount;
        }
        System.out.println(amount);
        sc.close();
    }
}
