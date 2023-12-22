import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if(a-k>=0){
            a = a-k;
            System.out.println(a + " " + b);
        }
        else{
            k = k-a;
            a = 0;
            if(b-k>=0){
                b=b-k;
                System.out.println(a + " " + b);
            }
            else{
                System.out.println(0 + " " + 0);
            }
        }
    }
}
