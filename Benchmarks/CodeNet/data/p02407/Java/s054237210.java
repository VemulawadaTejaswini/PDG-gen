import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] array = new int[n];
        int i;
        for(i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        for(i=n-1;i>=1;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println(array[0]);
        sc.close();
    }
}
