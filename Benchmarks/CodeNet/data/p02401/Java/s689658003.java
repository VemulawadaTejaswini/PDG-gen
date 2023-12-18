import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int x, y, a;

      while(true){

        x = sc.nextInt();
        String op = sc.next();
        y = sc.nextInt();

        if(op.equals("+")){
          a = x + y ;
        }else  if(op.equals("-")){
          a = x - y ;
        }else  if(op.equals("*")){
          a = x * y ;
        }else  if(op.equals("/")){
          a = x / y ;
        }else{
          break;
        }

        System.out.println( a );

      }

    } 
}
