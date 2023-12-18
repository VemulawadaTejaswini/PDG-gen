import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int n, i;
        int a[] = new int[1000];
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        for( i = n - 1; i >= 0; i--){
            System.out.printf("%d", a[i]);
            if(i !=0){
                System.out.printf(" ");
            }
        }
        System.out.printf("\n");
        scan.close();
    }
}

