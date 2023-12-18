import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
        int count = 0;
        for(int i=x; i<=y; i++) {
            if(n%i==0){
                count++;
            }
        }
        System.out.printf("%d\n", count);
    }
}
