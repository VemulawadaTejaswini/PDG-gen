import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        if(a%x==0){
            System.out.println(b / x - a / x + 1);
        }
        else{
            System.out.println(b / x - a / x);
        }
    }
}