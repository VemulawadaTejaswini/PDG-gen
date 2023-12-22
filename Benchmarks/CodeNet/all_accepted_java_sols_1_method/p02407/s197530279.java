import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int n=sc.nextInt();
        int z[] =new int[n];
        for(int i=0;i<n;i++) {
            z[i]=sc.nextInt();
        }
        for(int i=(n-1);i>=1;i--) {
            System.out.print(z[i]+" ");
            }
        for(int i=(n-1);i>=0;i--) {
            if(i==0) 
            System.out.print(z[i]);
            }System.out.println();
        }
    }
