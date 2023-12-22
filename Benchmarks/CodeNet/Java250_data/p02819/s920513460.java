import java.util.Scanner;

public class Main {
    public  static boolean check(int x) {
        for(int i=2;i*i<=x;i++) {
            if(x%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        while(true) {
            if(check(x)) {
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}