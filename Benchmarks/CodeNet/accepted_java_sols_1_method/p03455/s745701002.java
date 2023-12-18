import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int multi = a*b;
        final String result;
        if(multi % 2 == 0){
            result = "Even";
        } else {
            result = "Odd";
        }
        System.out.println(result);
        sc.close();   
    }
}