import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);

        int num = sc.nextInt();

        float f = num/1000f;

        int l = (int)(Math.ceil(f));
        System.out.println(l*1000-num);
    }
}
