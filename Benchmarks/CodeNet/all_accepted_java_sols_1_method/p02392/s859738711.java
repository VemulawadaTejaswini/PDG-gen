import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && b < c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }    
    }
}