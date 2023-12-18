import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int i=1;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x != 0){
            System.out.println("Case " + i +": " + x);
            x = sc.nextInt();
            i++;
        }
    }
}
