import java.io.PrintWriter;
import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            if(x==0&&y==0) break;
            if(x<=y) System.out.println(x+" "+y);
            else System.out.println(y+" "+x);
        }
    }
}