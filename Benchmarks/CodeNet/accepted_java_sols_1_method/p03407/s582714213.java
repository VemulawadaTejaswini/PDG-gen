import java.util.Scanner;
class Main{
    public static void main(String[]args){
      Scanner stdIn=new Scanner(System.in);
      int a=stdIn.nextInt();
      int b=stdIn.nextInt();
      int c=stdIn.nextInt();
      if(1<=a && a<=500 && 1<=b && b<=500 && 1<=c && c<=1000){
        if(a+b>=c){
          System.out.println("Yes");
        }else
        System.out.println("No");
      }
}
}