import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int X = sc.nextInt();
        int ans = (10000 - X) % 1000;
        System.out.println(ans);
    } 
}