import java.util.Scanner;

public class Main {
    static int k[] = new int[45];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k[0]=1;
        k[1]=1;
        for (int i = 2; i < k.length; i++) {
            k[i]=k[i-2]+k[i-1];
        }
        System.out.println(k[n]);
    }
}
