import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b){
            a = a^b;
            b = a^b;
            a = a^b;
        }
        if(a > c ){
            a = a^c;
            c = a^c;
            a = a^c;
        }
        if(b > c){
            b = b^c;
            c = b^c;
            b = b^c;
        }
        System.out.print(a + " " + b + " " + c);
        System.out.println();
    }
}
