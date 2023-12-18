import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        
        int M = N % 500;
        if(M > A){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}