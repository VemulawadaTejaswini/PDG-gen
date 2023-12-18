import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<(int)(a.length)/2; i++){
            int tmp = a[i];
            a[i] = a[(a.length-1)-i];
            a[a.length-i-1] = tmp;
        }
        for(int i=0; i<a.length-1; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print(a[a.length-1]);
        System.out.println();
    }
}
