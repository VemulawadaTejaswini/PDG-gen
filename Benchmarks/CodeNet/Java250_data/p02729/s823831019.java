import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int nCount = 0;
        int mCount = 0;

        if (n >= 2){
           nCount = (n * (n-1))/2;
        }
        if (m >= 2){
            mCount = (m * (m-1))/2;
        }
        System.out.println(nCount + mCount +"");
    }
}