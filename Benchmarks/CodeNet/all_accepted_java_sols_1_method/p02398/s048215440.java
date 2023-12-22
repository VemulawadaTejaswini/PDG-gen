import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();

      int i = 0 ;

        for (; a <= b ; a++){
           if( c % a == 0 ){
               i ++ ;
        }
    }
   System.out.println(i);
 }
}
