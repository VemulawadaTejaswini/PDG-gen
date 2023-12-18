import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0) {
            int k=sc.nextInt(),p=sc.nextInt();
            System.out.println(k%p==0?p:k%p);
        }
    }
}
