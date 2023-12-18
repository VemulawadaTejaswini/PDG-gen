import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long X = Long.parseLong(sc.next());
        double money=100;
        int count=0;

        while(money < X){
            count++;
            money = Math.floor(money * 1.01);
        }
        System.out.println(count);

        sc.close();

        }
    
}