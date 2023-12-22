import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();
        Integer[] a = new Integer[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        boolean f = true;
        Integer[] b = new Integer[n];
        
        for(int i = n; i >= 1; i--){
            int count = 0;
            for(int j = i; j <= n; j += i){
                if(j != i && b[j-1] == 1){
                    count++;
                }
            }

            if(a[i-1] == 0){
                b[i-1] = (count % 2);
            } else {
                b[i-1] = ((count + 1) % 2);
            }
        }

        int c = 0;
        for(int i = 0; i < n; i++){
            if(b[i] == 1){
                c++;
            }
        }
        System.out.println(c);
        for(int i = 0; i < n; i++){
            if(b[i] == 1){
                System.out.print(i+1 + " ");
            }
        }
        System.out.println();


    }
}