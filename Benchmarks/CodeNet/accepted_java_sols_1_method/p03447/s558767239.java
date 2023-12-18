import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = x-a;
        ans = ans%b;

        System.out.println(ans);

    }
}