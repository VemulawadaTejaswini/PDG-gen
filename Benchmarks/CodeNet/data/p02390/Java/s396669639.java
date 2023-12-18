import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            System.out.printf("%d:%d:%d\n",num/3600,(num%3600)/60,num%60);
    }
}
