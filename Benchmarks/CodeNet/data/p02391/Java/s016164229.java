import java.util.Scanner;

class Main{
  public static void main(String args[]){
      Scanner scan = new Scanner(System.in);

      int a = scan.nextInt();
      int b = scan.nextInt();

      int aa = a;
      int bb = b;

      if(a < b){
        System.out.println(aa + " < " + bb);
      }else if(a > b){
        System.out.println(aa + " > " + bb);
      }else{
        System.out.println(aa + " == " + bb);
      }
  }
}