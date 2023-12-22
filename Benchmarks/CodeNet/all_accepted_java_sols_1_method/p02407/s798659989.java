import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int j=a.length; j>0;j--){
            if(j != 1) System.out.printf("%d ",a[j-1]);
            else System.out.printf("%d",a[j-1]);
        }
        System.out.println();
        sc.close();
    }
}
