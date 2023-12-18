import java.util.Scanner;

   class Main{
      public static void main(String args[]){
         Scanner sc =new Scanner(System.in);
        
         int  r  =sc.nextInt();
         int  c  =sc.nextInt();
         int[][]x=new int[r][c];
         int  g  =0;
         
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
               x[i][j]=sc.nextInt();
            }
         }
         
         for(int i=0;i<r;i++){
            int gr =0;
            for(int j=0;j<c;j++){
               System.out.print(x[i][j]+" ");
               gr +=x[i][j];
               g  +=x[i][j];
            }
            System.out.println(gr);
         }
         
         for(int j=0;j<c;j++){
            int gc=0;
            for(int i=0;i<r;i++){
               gc +=x[i][j];
            }
            System.out.print(gc+ " ");
         }
         System.out.println(g);
      }
   }

