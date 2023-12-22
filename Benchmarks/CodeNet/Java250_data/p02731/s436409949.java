import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        double length = (double) L / 3;
        double ans = length * length * length;
        System.out.println(ans);
        
    }
}
