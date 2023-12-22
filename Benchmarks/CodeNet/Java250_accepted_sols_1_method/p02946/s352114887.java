
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        for(int i=x-k+1;i<=x+k-1;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}