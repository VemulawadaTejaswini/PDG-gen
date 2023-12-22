
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        int    n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        
        if(n % 2 == 1 || n == 0){
            System.out.println("No");
            return;
        }
        String s1 = s.substring(0  , n/2);
        String s2 = s.substring(n/2, n);
        
        if(s1.startsWith(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}