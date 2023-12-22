import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        for(i=0;i<(double)(n/2);i++){
          int y;
          y=a[i];
          a[i]=a[n-i-1];
          a[n-i-1]=y;
        }
        for(i=0;i<n;i++){
          System.out.print(a[i]);
          if(i!=(n-1)){
            System.out.print(" ");
          }
        }
        System.out.println();
        
        sc.close();
    }
  }

