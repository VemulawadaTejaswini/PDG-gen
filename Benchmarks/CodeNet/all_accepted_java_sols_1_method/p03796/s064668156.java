import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long s = 1;
        
        for (int i = 1; i <= n ; i++) {
            s = s * i % 1000000007;
        }
        System.out.println(s);   
    }
}