import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int T = scanner.nextInt();
        int S = scanner.nextInt();
       

        scanner.close();

        if(T*S >= D){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
