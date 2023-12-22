import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int a[][][]=new int[5][4][11];

        for(int i=0;i<n;i++){
        int b =sc.nextInt();
        int f =sc.nextInt();
        int r =sc.nextInt();
        int v =sc.nextInt();
        a[b][f][r]+=v;
        }
        
        for(int i=1;i<=3;i++){
         for(int j=1;j<=3;j++){
          for(int k=1;k<=10;k++)
          System.out.print(" "+a[i][j][k]);
          System.out.print("\n");
         }
         System.out.println("####################");
        }

         for(int j=1;j<=3;j++){
          for(int k=1;k<=10;k++)
          System.out.print(" "+a[4][j][k]);
          System.out.print("\n");
         }
      }
      
  }
