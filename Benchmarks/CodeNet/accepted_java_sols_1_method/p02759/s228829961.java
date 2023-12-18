import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        int a=n/2;
        int b=n%2;
        
        if(b==0)
            System.out.println(a);
        else
            System.out.println(a+1);
    }
}