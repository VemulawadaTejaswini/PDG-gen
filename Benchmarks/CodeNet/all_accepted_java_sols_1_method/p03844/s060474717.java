import java.util.Scanner;

class Main{
    public static void main(String args[]){
 int a;
        int b;
 String c;
 Scanner scan = new Scanner(System.in);
 a = scan.nextInt();
 c = scan.next();
 b = scan.nextInt();
 if(c.equals("+")){
     System.out.println(a+b);
 }else if(c.equals("-")){
     System.out.println(a-b);
 }
    }
}