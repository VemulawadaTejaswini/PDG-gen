import java.util.Scanner;
class Main{
 public static void main(String aegs[]){
  int w,h,i,j;
  Scanner sc = new Scanner(System.in);
  while(true){
   h=sc.nextInt();
   w=sc.nextInt();
   if(h==0 && w==0)
    break;
   for(i=0;i<h;i++){
    for(j=0;j<w;j++)
     System.out.print("#");
   System.out.println();}
  }
  System.out.println();
 }
}
