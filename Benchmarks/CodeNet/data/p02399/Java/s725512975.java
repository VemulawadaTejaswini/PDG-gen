import java.util.Scanner;

public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c;
        c = (double)a/b;
        System.out.println((a/b) + " " + (a%b));
        System.out.printf("%.8f\n", c);
    }

    public static void main(String[] args){
        new Main();
    }
}

