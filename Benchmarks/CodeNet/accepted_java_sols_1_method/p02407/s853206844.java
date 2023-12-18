import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int[] a = new int[x];
        for(int i = 0 ; i < x ; i++){
            a[i] = sc.nextInt();
        }
        System.out.print(a[x-1]);
        for(int i = 1 ; i < x ; i++){
            System.out.print(" "+a[x-i-1]);
        }
        System.out.println();
    }
}
