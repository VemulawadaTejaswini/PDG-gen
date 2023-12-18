import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ten;
        int n = sc.nextInt();

        ten = new int[n];
        for(int i=0;i<n;i++){
            ten[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(ten[i]);
        }
        System.out.print("\n");
    }
}
