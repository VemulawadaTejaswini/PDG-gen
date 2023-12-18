import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int dif = b - a;
        int height = 0;
        for(int i = 1; i <= dif; i++){
            height += i;
        }
        int ans = height - b;
        System.out.println(ans);
    }
}
