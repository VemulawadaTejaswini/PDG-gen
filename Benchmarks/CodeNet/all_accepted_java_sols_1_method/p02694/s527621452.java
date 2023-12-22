import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long X=sc.nextLong();
        
        long now=100;
        int count=0;
        
        while(now<X){
            now*=1.01;
            count++;
        }
        System.out.println(count);
    }
}
