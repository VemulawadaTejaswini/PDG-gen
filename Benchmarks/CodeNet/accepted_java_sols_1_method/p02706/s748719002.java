import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a[] = new int[m];
        for(int i = 0; i < m; i++){
            a[i] = scan.nextInt();
        }
        
        for(int i = 0; i < m; i++){
            n = n - a[i];
        }

        if(n < 0){
            System.out.println("-1");
        }else{
            System.out.println(n);
        }
    }
}