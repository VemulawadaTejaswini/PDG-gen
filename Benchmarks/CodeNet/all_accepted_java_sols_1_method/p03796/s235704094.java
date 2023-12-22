import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long power = 1;
        for(int i = 1; i <= n; i++){
            power *= i;
            power = power % (int)(Math.pow(10,9) + 7);
        }

        System.out.println(power);
    }
}

