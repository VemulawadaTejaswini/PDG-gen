import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = (n + 1) / 2;
        System.out.println(p);
        sc.close();
    }
}