import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        int a[][]=new int[r+1][c+1];
      
        for(int i=0;i<r;i++)
         for(int j=0;j<c;j++)
         a[i][j]=sc.nextInt();
        
        for(int i=0;i<r;i++)
         for(int j=0;j<c;j++)
         a[i][c]+=a[i][j];
        
        for(int i=0;i<=c;i++)
            for(int j=0;j<r;j++)
            a[r][i]+=a[j][i];
        
        for(int i=0;i<=r;i++) {
         for(int j=0;j<c;j++) 
         System.out.print(a[i][j]+" ");
         System.out.println(a[i][c]);
         }
    }   
    }
    
