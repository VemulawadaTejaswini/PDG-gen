import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double xd = n / 1.08;
        int x1 = (int)Math.floor(xd);
        int x2 = (int)Math.ceil(xd);
        int result = -1;
        if(((int)Math.floor(x1*1.08))==n) {
            result = x1;
        }
        else if(((int)Math.floor(x2*1.08))==n) {
            result = x2;
        }
        System.out.println(result==-1?":(":result);
    }
}
