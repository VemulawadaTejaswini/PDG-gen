import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            if(red >= green) green *= 2;
            else if( green >= blue) blue *= 2;
        }
        if(red < green && green < blue) System.out.println("Yes");
        else System.out.println("No");
    }
}