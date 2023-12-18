import java.util.Scanner;
 
class Main{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   double a = scanner.nextDouble();
   double b = scanner.nextDouble();
   double c = scanner.nextDouble();
   double d = scanner.nextDouble();
   
   double[] e= new double[]{a*c,a*d,b*c,b*d};
   
   double num = e[0];
   
   for(int i=1;i<4;i++) if(num < e[i]) num = e[i];
   
   System.out.println(num);
   
 }
   
}