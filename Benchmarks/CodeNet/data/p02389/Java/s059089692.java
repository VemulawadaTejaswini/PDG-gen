import java.util.Scanner;

class test{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       sc.useDelimiter("\\s");
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       System.out.print(a*b + "\n");
   }
}