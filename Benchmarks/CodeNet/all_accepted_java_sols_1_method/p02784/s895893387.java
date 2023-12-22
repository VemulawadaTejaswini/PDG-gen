import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
            h -= a[i];
        }
        if(h <= 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}