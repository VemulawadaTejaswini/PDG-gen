import java.util.Scanner;
class Main {
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
 
   int a = scan.nextInt();
   int b = scan.nextInt();
   int c = scan.nextInt();
   int tmp;
 
   if(a > b){tmp = a;
             a = b;
             b = tmp;}
 
    if(a > c){tmp = a;
              a = c;
              c = tmp;}
  
    if(b > c){tmp = b;
              b = c;
              c = tmp;}
 
     System.out.println(a + " " + b + " " + c);
    }
}
 