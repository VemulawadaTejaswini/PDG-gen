import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pay = 1000;

        while(n>pay){
            pay += 1000;
        }

        System.out.println(pay-n);


        scn.close();

    }


}