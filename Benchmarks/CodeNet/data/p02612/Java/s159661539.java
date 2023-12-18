import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int pay = 0;
        while(pay < n){
            pay += 1000;
        }
        System.out.println(pay - n);
        scan.close();
    }
}
