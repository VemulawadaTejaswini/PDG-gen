import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int kame = x * 4;
        int num = kame - y;
        if(num < 0){
            System.out.println("No");
        }else if(num % 2 == 0 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}