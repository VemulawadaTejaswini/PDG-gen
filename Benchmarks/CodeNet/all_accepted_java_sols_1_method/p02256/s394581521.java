import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        //入れ替え
        if(a<b){
            c = a;
            a = b;
            b = c;
        }

        while(a%b != 0){
            int d = a%b;
            a = b;
            b = d;
        }

        System.out.println(b);

    }
}
