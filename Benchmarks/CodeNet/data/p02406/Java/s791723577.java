import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int x=scan.nextInt();
boolean a=true;
for(int i=1; i<x+1; i++){
   if(i%3==0){
      System.out.print(" "+i);
      a=false;
   }
   if(i>10){
      while(a){
         if(i%10==3){
            System.out.print(" "+i);
            a=false;
         }else if(i>10){
            i =i/10;
         }else  a=false;
      }
   }
   a=true;
}
System.out.println();
}
} 