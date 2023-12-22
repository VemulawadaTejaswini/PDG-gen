import java.util.*;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int x = sc.nextInt();
   int y = 0;
   Gcd gcd = new Gcd();
   for(int i=1;i<=x;i++){
     for(int j=1;j<=x;j++){
       for(int k=1;k<=x;k++)
         y+=gcd.gcd(i,j,k);
     }
   }
   System.out.println(y);
 }
}

class Gcd{
   int gcd(int a,int b,int c){
     int min = a;
     int num = 1;
     if(a>b&&b<=c)
       min = b;
     else if(a>b&&b>c)
       min = c;
     
     for(int i=1;i<=min;i++){
       if(a%i==0&&b%i==0&&c%i==0)
         num = i;
     }
     return num;
   }
}