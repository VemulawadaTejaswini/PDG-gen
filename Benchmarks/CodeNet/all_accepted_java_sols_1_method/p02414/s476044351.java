import java.util.Scanner;
class Main
{ 
   public static void main(String[] args)
      {

        
   Scanner sc = new Scanner(System.in);
    int n, m, l,i,j,k;
    n = sc.nextInt();
    m = sc.nextInt();
    l = sc.nextInt();
    int[][] a = new int[n][m];
    int[][] b = new int[m][l];
    long c ;

    for(i=0;i<n;i++){
      for(j=0;j<m;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(j=0;j<m;j++){
      for(k=0;k<l;k++){
        b[j][k]=sc.nextInt();
      }
    }

    for(i=0;i<n;i++){
        for(j=0;j<l;j++){
            c=0;
            for(k=0;k<m;k++){
                c+=a[i][k]*b[k][j];
            }
        System.out.print(c);
        if(j==l-1)  System.out.println();
        else   System.out.print(" ");
        }
    }
    
}}


