import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a <= b && a <= c) {
                if(b <= c) System.out.println(a + " " + b + " " + c);
                else System.out.println(a + " " + c + " " + b);
            }else if(b <= a && b <= c){
                if(a <= c) System.out.println(b + " " + a + " " + c);
                else System.out.println(b + " " + c + " " + a);
            }else if(c <= a && c <= b){
                if(a <= b) System.out.println(c + " " + a + " " + b);
                else System.out.println(c + " " + b + " " + a);
            }
            
            sc.close();
        }
}
