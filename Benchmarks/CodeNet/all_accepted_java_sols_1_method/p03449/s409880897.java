import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);

   int N=sc.nextInt();
   int A[][]=new int[2][N];
   int sum[]= new int[N];
   int x=0,y=0,collect=0,max=0;

    for (int i=0;i<2;i++)
   {
        for (int j=0; j<N;j++)
        {
       A[i][j]=sc.nextInt();
        }

   }
  /* for (int i=1;i<N;i++)
   {
       sum[i]=A[0][i]+A[1][i];
       if(sum[i]>(A[0][i-1]+A[1][i-1]))
           max=i;
   }
   */
   for(int j=0;j<N;j++)
   {
       for(int i=0; i<N;i++)
       {
       if(i<=j)
           collect+=A[0][i];
       if(i>=j)
           collect+=A[1][i];
       }
       if(collect>max)
           max=collect;
       collect=0;
   }



           System.out.println(max);


   sc.close();
 }
}
