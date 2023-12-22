import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
    
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=1;
        int a[][]=new int[n+1][m+1];
        int b[]=new int[m+1];
        int sum=0;
     
        for(int i=1;i<=n;i++)
         for(int j=1;j<=m;j++)
           a[i][j]=sc.nextInt();
        
        for(int i=1;i<=m;i++)
         b[i]=sc.nextInt();
        
        for(int i=1;i<=n;i++) {
         for(int j=1;j<=m;j++)
          sum+=a[i][j]*b[j];
         System.out.println(sum);
         sum=0;
        }
  }
  
}
