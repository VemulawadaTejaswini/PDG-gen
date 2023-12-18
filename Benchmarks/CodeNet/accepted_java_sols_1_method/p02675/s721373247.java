import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N = N % 100;
        N = N % 10;
        if(N == 3){
            System.out.print("bon");
        }else if(N == 2||N == 4||N == 5||N == 7||N == 9){
            System.out.print("hon");
        }else{
            System.out.print("pon");
        }
    }
}