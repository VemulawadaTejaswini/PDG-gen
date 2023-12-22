import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        if(l%3==0){
            double res=(l/3)*(l/3)*(l/3);
            System.out.println(res);
            return;
        }

        double max=(double)l/3;
        System.out.println(max*max*max);

    }
}