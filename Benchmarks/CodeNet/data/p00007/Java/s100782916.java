import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int Debt = sc.nextInt();
        double a =100;
        for (int i =0;i<Debt;i++){
            a = Math.ceil(a*1.05);
        }
        System.out.println((int)a*1000);
    }
}