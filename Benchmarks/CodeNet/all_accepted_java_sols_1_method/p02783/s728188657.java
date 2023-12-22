import java.util.Scanner;
 
class Main{
public static void main(String[] args){
 
Scanner sc=new Scanner(System.in);
  int H=sc.nextInt();
  int A=sc.nextInt();
  int i=0;
 
  
  
  while(0<H){
    i++;
    H-=A; 
   }System.out.println(i);
 }
}
