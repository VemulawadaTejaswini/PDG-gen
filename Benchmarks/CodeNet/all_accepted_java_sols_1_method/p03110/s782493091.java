import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        float f = 0f;
        for(int i=0; i<n ; i++){
            double amount = sc.nextDouble();
            String curr = sc.next();
            if(curr.equals("JPY"))
                f += amount;
            if(curr.equals("BTC"))
                f += amount*380000;
        }

        System.out.println(f);

    }
}