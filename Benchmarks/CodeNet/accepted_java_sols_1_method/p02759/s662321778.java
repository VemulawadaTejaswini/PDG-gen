import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int ans = 0;
        if(N%2==0){
            System.out.println(N/2);
        } else {
            System.out.println((N/2)+1);
        }

    }
}