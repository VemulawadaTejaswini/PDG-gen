import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a;
        boolean b = true;
        for (int i=0;i<n;i++){
            a = scanner.nextInt();
            if (a%2==0){
                if (a%3!=0&&a%5!=0){
                    b = false;
                }
            }

        }
        if (b){
            System.out.println("APPROVED");
        }else {
            System.out.println("DENIED");
        }
    }
}