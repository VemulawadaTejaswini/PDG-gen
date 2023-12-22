import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        scan.close();
        int result = 0;
        result = N * N * N;
        System.out.println(result);
        
    }
    
}
