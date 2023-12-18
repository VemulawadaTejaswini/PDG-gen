import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int x = n%10;
        int y = n/10%10;
        int z = n/100%10;
        int w = n/1000;

        if((x==y&&y==z) || (y==z&&z==w)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}