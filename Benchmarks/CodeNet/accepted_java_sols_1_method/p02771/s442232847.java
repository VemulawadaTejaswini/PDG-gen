import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        if(i==j && i!=k || i==k && i!=j || j==k && j!=i){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
