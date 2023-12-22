import java.util.Scanner;
 
class Main{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   long a = (long)scanner.nextInt();
   long b = (long)scanner.nextInt();
   long c = (long)scanner.nextInt();
   long d = (long)scanner.nextInt();
   
   long[] e= new long[]{a*c,a*d,b*c,b*d};
   
   long num = e[0];
   
   for(int i=1;i<4;i++) if(num < e[i]) num = e[i];
   
   System.out.println(num);
   
 }
   
}