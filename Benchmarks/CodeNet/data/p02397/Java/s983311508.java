import java.util.*;

class Main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in).useDelimiter("\\s\\*n");
  
  while(1){
   int x=scan.nextInt();
   int y=scan.nextInt();

   if(x==0 && y==0){break;}

   int z;
   if(x>y){z=x;x=y;y=z;}

   System.out.println(x+" "+y);
  }
 }
}