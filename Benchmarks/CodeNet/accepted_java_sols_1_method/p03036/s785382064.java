import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int r = s.nextInt();
       int D = s.nextInt();
       int x = s.nextInt();
       int tmp = x;

       for(int i = 0; i < 10; i++){
           System.out.println(r*tmp-D);
           tmp = r*x-D;
           x = tmp;

       }
    }
}