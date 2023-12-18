import java.util.Scanner;
class Main{
 public static void main(String args[]){
  int m,f,r,g;
  Scanner sc = new Scanner(System.in);
  while(true){
   m=sc.nextInt();
   f=sc.nextInt();
   r=sc.nextInt();
   g=m+f;
   if(m==-1 && f==-1 && r==-1)
    break;
   if(m==-1 || f==-1 || g<30)
    System.out.println("F");
   else if(g>=80)
    System.out.println("A");
   else if(g>=65)
    System.out.println("B");
   else if(g>=50)
    System.out.println("C");
   else if(g>=30){
    if(r>=50)
     System.out.println("C");
    else
     System.out.println("D");}
   }
 }
}
