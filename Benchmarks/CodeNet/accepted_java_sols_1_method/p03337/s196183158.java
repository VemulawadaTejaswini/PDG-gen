import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A +  B;
        int hiku = A - B;
        int seki = A * B;

        System.out.println(Math.max(seki,Math.max(sum,hiku)));
    }
}
