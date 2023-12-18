import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int K, X;
        Scanner scan = new Scanner(System.in);
        K = scan.nextInt();
        X = scan.nextInt();
        if(K*500>=X){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}