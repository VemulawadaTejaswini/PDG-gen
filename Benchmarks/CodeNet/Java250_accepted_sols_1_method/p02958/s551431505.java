import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int s = scan.nextInt();
            if(i != s){
                count+=1;
            }
        }

        System.out.println(count>2?"NO":"YES");
    }
}
