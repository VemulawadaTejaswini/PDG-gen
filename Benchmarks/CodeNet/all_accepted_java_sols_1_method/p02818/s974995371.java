import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        if(A-K>=0){
            System.out.println(A-K + " " + B);
        }else if(A+B-K<0){
            System.out.println("0 0");
        }else{
            System.out.println("0 " + (A+B-K));
        }

    }

}
