import java.util.Scanner;
 
class Main{
          public static void main(String [] args){
                      Scanner scan = new Scanner(System.in);
                      int i = 1;
                      while(scan.hasNext()){
                          int x = Integer.parseInt(scan.next());
                          if(x == 0){break;
                          }
                          System.out.println("Case " + i + ": " + x);
                          i++;
                      }
          }
}