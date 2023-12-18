import java.util.Scanner;
class Main
{ 
   public static void main(String[] args)
      {
   Scanner sc = new Scanner(System.in);
    int r, c, i, j;
    r = sc.nextInt();
    c = sc.nextInt();
    int[][] a = new int[101][101];
    
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            a[i][j]=sc.nextInt();
             a[i][c]+=a[i][j];
             a[r][j]+=a[i][j];
             a[r][c]+=a[i][j];
}
}

    for(i=0;i<r+1;i++){
        for(j=0;j<c;j++){
               System.out.print(a[i][j]+" ");
        }
         System.out.println(a[i][j]);
    }
    }
}

