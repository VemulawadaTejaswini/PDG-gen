import java.util.*;
class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) break;
            System.out.println("" + Math.min(a, b) + " " + Math.max(a,b));
        }
    }
}