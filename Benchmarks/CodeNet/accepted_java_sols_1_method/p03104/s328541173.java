import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a % 2 != 0 && b % 2 == 0){
            long c = ((b-a-1)/2) % 2;
            System.out.println(a^b^c);
        }else if(a % 2 != 0){
            long c = ((b-a)/2) % 2;
            System.out.println(a^c);
        }else if(b % 2 == 0){
            long c = ((b-a)/2) % 2;
            System.out.println(b^c);
        }else{
            long c = ((b-a+1)/2) % 2;
            System.out.println(c);
        }
    }
}
