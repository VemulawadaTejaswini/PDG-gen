import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = Long.parseLong(sc.next());
        long v = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        long t = Long.parseLong(sc.next());

        long vw = v - w;
        long diff = (long)Math.abs(a - b);
        if(vw * t >= diff){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}