import java.util.Scanner;
public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int area = x*y;
            int length = 2*x + 2*y;
            System.out.println(area + " " + length);
            sc.close();
        }
}
