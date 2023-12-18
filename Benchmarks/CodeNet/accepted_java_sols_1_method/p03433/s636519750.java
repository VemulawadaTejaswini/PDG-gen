import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int num = N / 500;
        if(A + 500 * num >= N){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }

}