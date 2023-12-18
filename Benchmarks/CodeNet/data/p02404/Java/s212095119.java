import java.util.Scanner;
class Main{
 public static void main(String args[]){
  int h,w,i,j,p;
  Scanner sc = new Scanner(System.in);
  while(true){
   h=sc.nextInt();
   w=sc.nextInt();
   if(h==0 && w==0)
    break;
   for(i=0;i<h;i++){
    if(i==0 || i==h-1){
     for(j=0;j<w;j++)
      System.out.print("#");
     System.out.println("");}
    else{
     System.out.print("#");
     for(p=0;p<w-2;p++)
      System.out.print(".");
     System.out.println("#");}
   System.out.println();}}
 }
}
