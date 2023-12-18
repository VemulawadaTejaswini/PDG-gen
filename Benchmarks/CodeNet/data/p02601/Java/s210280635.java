import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        while(k > 0 && b < a){
            b *= 2;
            k--;
        }
        while(k > 0 && c < b){
            c *= 2;
            k--;
        }
        if(b > a && c > b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
