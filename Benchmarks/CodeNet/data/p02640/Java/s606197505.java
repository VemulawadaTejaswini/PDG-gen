import java.util.Scanner;
public class CP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        if(x>4*y){
            System.out.println("No");
            return;
        }
        else if(y%2==0){
            System.out.println("Yes");
        }
    }
}