import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        long a=s.nextLong(),b=s.nextLong(),r=0;
        if(a%2==1){
            r^=a;
            ++a;
        }
        if(b%2==0){
            r^=b;
            --b;
        }
        r^=(b-a+1)/2%2;
        System.out.println(r);
    }
}