import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = (int)Math.sqrt(a);
        boolean isNotNature = true;
        while(isNotNature) {
            isNotNature = false;
            for (int i = 2; i <= n; i++) {
                if (a % i == 0){
                    isNotNature = true;
                    break;
                }
            }
            if(!isNotNature) break;
            a++;
        }
        System.out.println(a);
    }
}
