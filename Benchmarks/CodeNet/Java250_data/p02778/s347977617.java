import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        for(int i = 1 ; i <= N ; i++){
            System.out.print("x");
        }
        scanner.close();
    }
}