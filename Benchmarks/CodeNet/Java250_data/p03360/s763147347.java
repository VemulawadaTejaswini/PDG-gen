import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int k = Integer.parseInt(sc.nextLine());

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        int c = Integer.parseInt(s1[2]);


        int result=0;


        int max = Math.max(a, Math.max(b, c));
        double tmp = Math.pow((double)2, (double)k);
        result = max *(int)tmp  + a + b + c -max;

        System.out.println(result);
    }
}