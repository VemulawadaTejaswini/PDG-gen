import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int it = 3;
        int total = 0;
        scanner.close();
        System.out.println(helper(n,it,total));
    }
    public static int helper(int n, int it, int total){
        if(it == 0){
          return total;
        } else {
          return helper(n, it - 1, total * n);
        }

    }
}
