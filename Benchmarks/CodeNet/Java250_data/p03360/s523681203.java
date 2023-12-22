import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double k = (double)sc.nextInt();


        if (Math.max(Math.max(a,b), c) == c){
            System.out.println(a+b+c*(int)Math.pow(2, k));
        }else if (Math.max(Math.max(a, b), c) == b){
            System.out.println(a+b*(int)Math.pow(2, k)+c);
        }else{
            System.out.println(b+c+a*(int)Math.pow(2, k));
        }
    }
}