import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();
 
        for(int i = 0; i < t; i++){
            a = a + v;
            b = b + w;
            if(a == b){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}