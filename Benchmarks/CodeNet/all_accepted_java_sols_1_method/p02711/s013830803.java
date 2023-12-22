import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = k / 100;
        int t = k % 100;
        int b = t / 10;
        int c = t % 10;
        if(a == 7 || b == 7 || c == 7){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}