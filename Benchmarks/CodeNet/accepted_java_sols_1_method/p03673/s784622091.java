import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];


        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            //a[i] = i;
        }

        if(n % 2 == 0){
            for(int i = n - 1; i >= 0; i -= 2){
                System.out.println(a[i]);
            }
            for(int i = 0; i < n; i += 2){
                System.out.println(a[i]);
            }
        }else{
            for(int i = n - 1; i >= 0; i -= 2){
                System.out.println(a[i]);
            }
            for(int i = 1; i < n; i += 2){
                System.out.println(a[i]);
            }
        }


    }
}
