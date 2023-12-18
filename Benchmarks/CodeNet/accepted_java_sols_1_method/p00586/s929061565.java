import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n|\\s");
        while(true) {
            int a;
            try{
                a = sc.nextInt();
            } catch(Exception e) {
                break;
            }
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}