import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);

   int A=sc.nextInt();
   int B=sc.nextInt();
   int C=sc.nextInt();
   int X=sc.nextInt();
   int count=0;
           int Cn= X/50;
           int Bn= X/100;
           int An= X/500;
           if(An>A)
               An=A;
           if(Bn>B)
               Bn=B;
           if(Cn>C)
               Cn=C;
    for(int i=0;i<=An;i++)
   {
        for (int j=0; j<=(X-(500*i))/100;j++)
        {
            if(j<=Bn){
            if((X-(500*i)-(100*j))<=(Cn*50))
                count++;
            else
                continue;
            }
        }


   }

           System.out.println(count);


   sc.close();
 }
}
