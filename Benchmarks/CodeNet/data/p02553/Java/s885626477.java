import java.util.Scanner;
 
class Main{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   int a = scanner.nextInt();
   int b = scanner.nextInt();
   int c = scanner.nextInt();
   int d = scanner.nextInt();
   
   int[] e= new int[]{a*c,a*d,b*c,b*d};
   
   int num = e[0];
   
   for(int i=1;i<4;i++) if(num < e[i]) num = e[i];
   
   System.out.println(num);
   
 }
   
}