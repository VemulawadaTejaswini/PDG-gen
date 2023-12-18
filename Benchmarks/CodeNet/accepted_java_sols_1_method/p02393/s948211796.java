import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);

        //変数の格納
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b) {
            if(c>a) {
                String anString = b+" "+c+" "+a;
                System.out.println(anString);
            }
            else if(c>b) {
                String anString =b+" "+c+" "+a;
                System.out.println(anString);
            }
            else {
                String anString =c+" "+b+" "+a;
                System.out.println(anString);
            }
        }

        else {
            if(c>b) {
                String anString =a+" "+b+" "+c;
                System.out.println(anString);
            }
            else if(c>a) {
                String anString =a+" "+c+" "+b;
                System.out.println(anString);
            }
            else {
                String anString =c+" "+a+" "+b;
                System.out.println(anString);
            }
        }

    }

}

