import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int weeks = s.nextInt();
        double debt = 100;
        while(weeks>0){
            debt = debt*1.05;
            debt = (int)Math.ceil(debt);
            weeks--;
        }
        System.out.println((int)debt*1000);
    }
}