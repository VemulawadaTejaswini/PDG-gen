import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int result = 1;
                if (a != 1) {
                        result = a * a * a;
                }
                System.out.println(result);
        }
}