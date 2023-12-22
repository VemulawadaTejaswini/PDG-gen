import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt(),X = scan.nextInt();
        X = X - K;
        for(int i=0;i< -1 + K*2;i++){
            System.out.print(X+1 + " ");
            X = X+1;
        }
    }
}