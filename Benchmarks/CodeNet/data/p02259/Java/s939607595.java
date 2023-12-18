
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++)a[i] = scan.nextInt();

        boolean f = true;
        int t = 0;
        while(f){
            f = false;
            for(int i = n-1;i >= 1;i--){
                if(a[i] < a[i-1]){
                    int c = a[i];
                    a[i] = a[i-1];
                    a[i-1] = c;
                    f = true;
                    t++;
                }
            }
        }
        for(int i = 0;i < n;i++){
            if(i != 0)System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println(t);

        scan.close();
    }

}
