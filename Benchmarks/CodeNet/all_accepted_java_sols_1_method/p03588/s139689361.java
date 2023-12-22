import java.util.Scanner;
class Main{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int N=sc.nextInt();
          int a=0;int b=0;int A=0;int B=0;
          for(int i=1;i<=N;i++){
               A=sc.nextInt();
               B=sc.nextInt();
               if(A>a){
                     a=A;
                     b=B;
             }
        }System.out.print(a+b);
   }
}