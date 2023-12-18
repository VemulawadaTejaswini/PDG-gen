import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
    
        int a = 0;
        while(a < n){
            a += 1000;
        }
        System.out.println(a - n);
    }
}